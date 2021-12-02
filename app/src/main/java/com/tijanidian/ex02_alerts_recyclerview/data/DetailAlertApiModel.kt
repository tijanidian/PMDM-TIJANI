package com.tijanidian.ex02_alerts_recyclerview.data

import com.tijanidian.ex02_alerts_recyclerview.domain.AlertModel
import com.tijanidian.ex02_alerts_recyclerview.domain.FileModel

//Creamos el DetailAlertApiModel para la segunda vista
data class DetailAlertApiModel(
    val id: String,
    val alert_id: String,
    val title: String,
    val type: String,
    val date: String,
    val summary: String,
    val body: String,
    val source: String,
    val files: List<FileApiModel>
) {

    fun toModel(): AlertModel = AlertModel(
        alert_id,
        title,
        type.toInt(),
        summary,
        date,
        body,
        source,
        files.map { fileApiModel -> fileApiModel.toModel() }
    )

}

data class FileApiModel(val id: String, val alert_id: String, val name: String, val url: String) {

    fun toModel(): FileModel = FileModel(name, url)
}