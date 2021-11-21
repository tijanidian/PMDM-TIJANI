package com.tijanidian.ex02_alerts_recyclerview.presentation

import androidx.lifecycle.ViewModel
import com.tijanidian.ex02_alerts_recyclerview.domain.GetAlertUserCase

class Ut02AlertRecyclerViewModel(private val useCase: GetAlertUserCase) : ViewModel() {

    fun getAlerts(): List<AlertViewState> {
        val alerts = useCase.execute()
        return alerts.map { alertModel ->

            AlertViewState(
                alertModel.title,
                alertModel.datePublished,
                alertModel.summary,
                alertModel.type,
                alertModel.id
            )
        }

    }
}