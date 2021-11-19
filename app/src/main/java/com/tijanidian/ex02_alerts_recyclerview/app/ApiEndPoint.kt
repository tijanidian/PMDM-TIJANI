package com.tijanidian.ex02_alerts_recyclerview.app

import com.tijanidian.ex02_alerts_recyclerview.data.AlertApiModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiEndPoint {

    @GET("alerts")
    fun getAlerts(): Call<ResponseApiModel<List<AlertApiModel>>>

}