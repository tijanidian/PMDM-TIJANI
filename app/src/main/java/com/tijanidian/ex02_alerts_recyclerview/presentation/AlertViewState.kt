package com.tijanidian.ex02_alerts_recyclerview.presentation

import com.tijanidian.ex02_alerts_recyclerview.domain.AlertModel

data class AlertViewState(
    val title: String,
    val date: String,
    val summary: String,
    val type: Int,
    val id: String
) {
    companion object {
        fun fromAlertModel(alertModel: AlertModel) = AlertViewState(
            alertModel.title,
            alertModel.datePublished,
            alertModel.summary,
            alertModel.type,
            alertModel.id
        )
    }
}
