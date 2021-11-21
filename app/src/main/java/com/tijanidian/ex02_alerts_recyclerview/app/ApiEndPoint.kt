package com.tijanidian.ex02_alerts_recyclerview.app

import com.tijanidian.ex02_alerts_recyclerview.data.AlertApiModel
import com.tijanidian.ex02_alerts_recyclerview.data.DetailAlertApiModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiEndPoint {

    @GET("alerts")
    fun getAlerts(): Call<ResponseApiModel<List<AlertApiModel>>>

    @GET("alerts/{alert_id}")
    fun getAlert(@Path("alert_id") id: String): Call<ResponseApiModel<DetailAlertApiModel>>

}