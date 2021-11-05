package com.tijanidian.mvvm.domain

class GetAlertUseCase(val alertRepository: AlertRepository){

    fun execute(): List<AlertModel> {
        return alertRepository.getAlerts()
    }
}