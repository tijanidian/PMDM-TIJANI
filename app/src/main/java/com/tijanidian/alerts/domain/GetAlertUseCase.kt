package com.tijanidian.alerts.domain

class GetAlertUseCase(private val alertRepository: AlertRepository) {

    fun execute(): List<AlertModel> {
        return alertRepository.getAlerts()
    }
}