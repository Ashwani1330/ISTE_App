package `in`.istevit.app.data.repository.flagship

import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import `in`.istevit.app.data.model.FlagshipModel
import `in`.istevit.app.data.network.service.CommonNetworkService
import android.util.Log
import java.net.UnknownHostException
import javax.inject.Inject

private const val TAG = "FlagshipRepoImpl"
class FlagshipRepoImpl @Inject constructor(private val service: CommonNetworkService, context: Context){

    private val ai: ApplicationInfo = context.packageManager
        .getApplicationInfo(context.packageName, PackageManager.GET_META_DATA)
    private val value = ai.metaData["API_KEY"]
    private val key = value.toString()
    suspend fun fetchFlagshipData(): Result<List<FlagshipModel>>{
        return try {
            val response = service.getFlagshipEvents(key)
            if (response.isSuccessful) {
                Result.success(response.body()!!)
            } else {
                Log.d(TAG, response.message())
                Result.failure(Exception(response.errorBody().toString()))
            }
        } catch (e: UnknownHostException) {
            Log.e(TAG, e.stackTraceToString())
            Result.failure(e)
        } catch (e: Exception){
            Log.e(TAG, e.stackTraceToString())
            Result.failure(e)
        }
    }
}