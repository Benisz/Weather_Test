package com.fb.weathertest.data.remote.api

import com.fb.weathertest.BuildConfig
import com.fb.weathertest.data.model.onecall.OneCallResponse
import com.fb.weathertest.util.DEFAULT_LAT
import com.fb.weathertest.util.DEFAULT_LON
import retrofit2.http.GET
import retrofit2.http.Query

interface OpenWeatherApi {
    @GET("onecall")
    suspend fun getAllWeather(
        @Query("lat")latitude: String = DEFAULT_LAT,
        @Query("lon")longitude: String = DEFAULT_LON,
        @Query("appid")apiKey: String = BuildConfig.WEATHER_API_KEY
    ): OneCallResponse
}
