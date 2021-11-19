package com.tijanidian.ex02_alerts_recyclerview.domain

interface AlertRepository {
    fun getALlAlerts():List<AlertModel>
    fun getAlert(id:String):List<AlertModel>
}