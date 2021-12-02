package com.tijanidian.ex02_alerts_recyclerview.data

import com.tijanidian.ex02_alerts_recyclerview.domain.AlertModel
import com.tijanidian.ex02_alerts_recyclerview.domain.AlertRepository


class AlertDataRepository( private val alertRemoteSource: AlertRemoteSource): AlertRepository {
    override fun getAlerts(): List<AlertModel> {
        return alertRemoteSource.getAlerts()
    }

    override fun getAlert(alertId: String): AlertModel? {
        return alertRemoteSource.getAlert(alertId)
    }


}