package com.tijanidian.alerts.domain

interface AlertRepository {
    fun getAlerts(): List<AlertModel>
}