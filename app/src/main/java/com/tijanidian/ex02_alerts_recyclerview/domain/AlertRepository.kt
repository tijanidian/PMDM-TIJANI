package com.tijanidian.ex02_alerts_recyclerview.domain

interface AlertRepository {
    fun getAlerts():List<AlertModel>
    fun getAlert(alertId: String):AlertModel?
}