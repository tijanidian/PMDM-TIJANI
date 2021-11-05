package com.tijanidian.mvvm.presentation

import androidx.lifecycle.ViewModel
import com.tijanidian.mvvm.domain.GetAlertUseCase

class AlertViewModel(private val getAlertUseCase:GetAlertUseCase): ViewModel() {

    fun getAlerts() = getAlertUseCase.execute()
}