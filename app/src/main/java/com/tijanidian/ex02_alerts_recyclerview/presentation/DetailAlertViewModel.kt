package com.tijanidian.ex02_alerts_recyclerview.presentation

import androidx.lifecycle.ViewModel
import com.tijanidian.ex02_alerts_recyclerview.domain.FindAlertUseCase

class DetailAlertViewModel(private val useCase: FindAlertUseCase) : ViewModel() {

    fun getALert(id: String): List<AlertDatailViewState> {
        val alert = useCase.execute(id)
        return alert.map { alertModel ->
            AlertDatailViewState(
                alertModel.id,
                alertModel.title,
                alertModel.datePublished,
                alertModel.summary,
                alertModel.body

            )
        }

    }
}