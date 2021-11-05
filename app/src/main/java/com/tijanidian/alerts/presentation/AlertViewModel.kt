package com.tijanidian.alerts.presentation

import androidx.lifecycle.ViewModel
import com.tijanidian.alerts.domain.GetAlertUseCase

class AlertViewModel(private val getAlertUseCase: GetAlertUseCase) : ViewModel() {

    fun getAlerts() = getAlertUseCase.execute()
}