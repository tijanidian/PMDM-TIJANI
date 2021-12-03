package com.tijanidian.ex02_alerts_recyclerview.presentation

import androidx.lifecycle.ViewModel
import com.tijanidian.ex02_alerts_recyclerview.domain.AlertModel
import com.tijanidian.ex02_alerts_recyclerview.domain.FindAlertUseCase

class DetailAlertViewModel(private val useCase: FindAlertUseCase) : ViewModel() {

    fun getAlert(id: String): AlertDatailViewState? {
        val alert = useCase.execute(id)
        alert.let {
            if (alert != null) {
                return AlertDatailViewState(
                    alert.id,
                    alert.title,
                    alert.type,
                    alert.datePublished,
                    alert.summary,
                    alert.body
                )
            }
            return null
        }
    }
}