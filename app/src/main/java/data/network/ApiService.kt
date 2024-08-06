package data.network

import com.android.volley.BuildConfig
import data.response.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
  @GET("current.json")
  suspend fun getWeather(
    @Query("key") key: Int,
    @Query("q") q: String,
    @Query("aqi") aqi: String
  ): WeatherResponse

}
