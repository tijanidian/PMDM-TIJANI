package com.tijanidian.ex02_alerts_recyclerview.app

import com.tijanidian.ex02_alerts_recyclerview.data.AlertApiModel
import com.tijanidian.ex02_alerts_recyclerview.data.DetailAlertApiModel

interface ApiClient {
    fun getAlerts():List<AlertApiModel>
    fun getAlert(id:String):DetailAlertApiModel?
}