package com.tijanidian.alerts_with_mvvm.presentation

import androidx.lifecycle.ViewModel
import com.tijanidian.alerts_with_mvvm.domain.GetAlertUseCase

class AlertViewModel(private val getAlertUseCase: GetAlertUseCase) : ViewModel() {

    fun getAlerts() = getAlertUseCase.execute()
}