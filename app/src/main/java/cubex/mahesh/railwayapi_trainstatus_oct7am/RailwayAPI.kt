package cubex.mahesh.railwayapi_trainstatus_oct7am

import cubex.mahesh.railwayapi_trainstatus_oct7am.beans.TrainStatusBean
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RailwayAPI {

    @GET("v2/live/train/{tno}/date/{date}/apikey/3us4nq7cyl/")
    fun getTrainStatus(@Path("tno") t1:String,
                     @Path("date")  d1:String ):Call<TrainStatusBean>
}