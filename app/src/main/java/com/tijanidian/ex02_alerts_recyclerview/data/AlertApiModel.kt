package com.tijanidian.ex02_alerts_recyclerview.data

import com.tijanidian.ex02_alerts_recyclerview.domain.AlertModel

data class AlertApiModel(
    val alert_id: String,
    val title: String,
    val summary: String,
    val type: String,
    val date: String,
    val body: String? = "",
    val source: String? = "",
){
    fun toModel():AlertModel{
        return AlertModel(alert_id, title, type.toInt(),
            summary, date, body ?: "",
            source ?: "", emptyList())
    }
}