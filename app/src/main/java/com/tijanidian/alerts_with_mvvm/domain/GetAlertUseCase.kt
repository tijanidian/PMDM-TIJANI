package com.tijanidian.alerts_with_mvvm.domain

class GetAlertUseCase(private val alertRepository: AlertRepository) {

    fun execute(): List<AlertModel> {
        return alertRepository.getAlerts()
    }
}