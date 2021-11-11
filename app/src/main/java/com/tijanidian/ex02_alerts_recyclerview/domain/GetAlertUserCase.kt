package com.tijanidian.ex02_alerts_recyclerview.domain

class GetAlertUserCase(private val repository: AlertRepository) {
    fun execute():List<AlertModel>{
        return repository.getALlAlerts()
    }
}