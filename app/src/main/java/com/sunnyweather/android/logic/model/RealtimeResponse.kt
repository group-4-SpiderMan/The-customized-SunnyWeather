package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

data class RealtimeResponse(val status: String, val result: Result) {

    data class Result(val realtime: Realtime)

    data class Realtime(val skycon: String, val temperature: Float, val apparent_temperature: Float, val humidity: Float, val visibility: Float, val wind: Windspeed, @SerializedName("air_quality") val airQuality: AirQuality)

    data class Windspeed(val speed: Float)

    data class AirQuality(val aqi: AQI)

    data class AQI(val chn: Float)

}