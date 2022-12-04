package `in`.istevit.app.data.repository.gallery

import `in`.istevit.app.data.database.ImagesDao
import `in`.istevit.app.data.model.GalleryModel
import `in`.istevit.app.data.network.service.CommonNetworkService
import android.util.Log
import androidx.lifecycle.LiveData
import java.net.UnknownHostException
import javax.inject.Inject

private const val TAG = "GalleryRepoImpl"

class GalleryRepoImpl @Inject constructor(private val dao: ImagesDao, private val service: CommonNetworkService) {

    suspend fun fetchGalleryData(): LiveData<List<GalleryModel>>{
        try {
            val response = service.getGallery()
            if (response.isSuccessful) {
                dao.insertAll(response.body()!!)
            } else {
                Log.d(TAG, response.message())
            }
        } catch (e: UnknownHostException) {
            Log.e(TAG, e.stackTraceToString())
        } catch (e: Exception){
            Log.e(TAG, e.stackTraceToString())
        }
        return dao.getAllImages()
    }
}