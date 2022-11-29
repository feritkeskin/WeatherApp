package com.feritkeskin.weatherforecast.service

import com.feritkeskin.weatherforecast.model.WeatherModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

//https://api.openweathermap.org/data/2.5/weather?q=%C5%9EANLIURFA&APPID=3722dea676a1ebade445b15d9f903364

interface WeatherAPI {

    @GET("data/2.5/weather?&units=metric&APPID=3722dea676a1ebade445b15d9f903364")
    fun getData(
        @Query("q") cityName: String
    ): Single<WeatherModel>

}