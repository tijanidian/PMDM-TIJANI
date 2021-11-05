package com.tijanidian.mvvm.domain

interface AlertRepository {
    fun getAlerts() : List<AlertModel>
}