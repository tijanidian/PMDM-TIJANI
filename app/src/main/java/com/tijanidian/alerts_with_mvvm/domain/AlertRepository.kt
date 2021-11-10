package com.tijanidian.alerts_with_mvvm.domain

interface AlertRepository {
    fun getAlerts(): List<AlertModel>
}