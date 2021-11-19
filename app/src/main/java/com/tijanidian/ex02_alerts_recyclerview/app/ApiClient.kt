package com.tijanidian.ex02_alerts_recyclerview.app

import com.tijanidian.ex02_alerts_recyclerview.data.AlertApiModel

interface ApiClient {
    fun getAlerts():List<AlertApiModel>
}