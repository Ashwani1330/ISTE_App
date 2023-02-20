package `in`.istevit.app.ui.blogs

import `in`.istevit.app.R
import `in`.istevit.app.adapters.BlogsAdapter
import `in`.istevit.app.data.model.BlogDetailsModel
import `in`.istevit.app.databinding.FragmentBlogBinding
import android.content.Intent
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import `in`.istevit.app.util.Result

@AndroidEntryPoint
class BlogFragment : Fragment(), BlogOnCLickCallback {
    lateinit var binding: FragmentBlogBinding
    private var blogsList = mutableListOf<BlogDetailsModel>()
    private lateinit var blogAdapter: BlogsAdapter
    lateinit var blogLayoutManager: LinearLayoutManager
    private var chId: Int = 1

    private val viewModel by lazy {
        ViewModelProvider(requireActivity())[BlogsViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlogBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val ai: ApplicationInfo? = context?.let {
            context?.packageManager
                ?.getApplicationInfo(it.packageName, PackageManager.GET_META_DATA)
        }
        val value = ai?.metaData?.get("API_KEY")
        val key = value.toString()

        blogAdapter = BlogsAdapter(requireContext()).also { it.setCallback(this) }
        blogLayoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = blogAdapter
        binding.recyclerView.layoutManager = blogLayoutManager

        binding.retryBTN.setOnClickListener {
            viewModel.fetchBlogs(key)
        }

        if (viewModel.blogsList.value == null) {
            viewModel.fetchBlogs(key)
        } else {
            when (val res = viewModel.blogsList.value!!) {
                is Result.Success -> {
                    blogsList.addAll(res.data)
                }

                else -> {
                    viewModel.fetchBlogs(key)
                }
            }
            blogAdapter.submitList(blogsList)
            binding.progressCircular.visibility = View.GONE
        }

        viewModel.blogsList.observe(viewLifecycleOwner) {
            when (it) {
                is Result.Loading -> {
                    binding.progressCircular.visibility = View.VISIBLE
                    binding.errorLayout.visibility = View.GONE
                    binding.chipAll.isCheckable = false
                    binding.chipRecents.isCheckable = false
                }

                is Result.Success -> {
                    blogsList.addAll(it.data)
                    blogAdapter.submitList(blogsList)
                    binding.progressCircular.visibility = View.GONE
                    binding.chipAll.isCheckable = true
                    binding.chipRecents.isCheckable = true
                }

                else -> {
                    binding.progressCircular.visibility = View.GONE
                    binding.errorLayout.visibility = View.VISIBLE
                    binding.chipAll.isCheckable = false
                    binding.chipRecents.isCheckable = false
                }
            }
        }

        binding.chipGroup.setOnCheckedChangeListener { _, checkedId ->
            run {
                if (chId != checkedId) {
                    when (checkedId) {
                        R.id.chip_all -> {
                            blogAdapter.submitList(blogsList)
                            binding.animationView.visibility = View.GONE
                        }
                        R.id.chip_recents -> {
                            var temp = blogsList.filter { it.filter == "recents" }
                            if (temp.isEmpty()) {
                                binding.animationView.visibility = View.VISIBLE
                            } else {
                                binding.animationView.visibility = View.GONE
                            }
                            blogAdapter.submitList(temp.toMutableList())
                        }
                    }
                    chId = checkedId
                }
            }
        }
    }

    override fun onClick(item: BlogDetailsModel) {
        val mIntent = Intent(requireContext(), BlogDetailsActivity::class.java)
        mIntent.putExtra("blogItem", item)
        startActivity(mIntent)
    }
}