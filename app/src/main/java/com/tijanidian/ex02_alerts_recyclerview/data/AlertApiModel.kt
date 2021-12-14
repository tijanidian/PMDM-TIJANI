package com.tijanidian.ex02_alerts_recyclerview.data

import com.tijanidian.ex02_alerts_recyclerview.domain.AlertModel
import com.tijanidian.ex02_alerts_recyclerview.domain.FileModel

data class AlertApiModel(
    val alert_id: String,
    val title: String,
    val summary: String,
    val type: String,
    val date: String
) {
    fun toModel(): AlertModel =
        AlertModel(
            alert_id,
            title,
            type.toInt(),
            summary,
            date,
            summary,
            "",
            emptyList()
        )
}

