package com.tijanidian.ex02_alerts_recyclerview.data

import com.tijanidian.ex02_alerts_recyclerview.app.ApiClient
import com.tijanidian.ex02_alerts_recyclerview.domain.AlertModel

class AlertRemoteSource(private val apiClient: ApiClient) {

    fun getAlerts(): List<AlertModel> {
        val alerts = apiClient.getAlerts()
        return alerts.map { alertApiModel -> alertApiModel.toModel() }
    }

    fun getAlert(alertId: String): AlertModel?{
        return apiClient.getAlert(alertId)?.toModel()
    }
}