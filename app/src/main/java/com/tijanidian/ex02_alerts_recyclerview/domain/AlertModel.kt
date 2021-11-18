package com.tijanidian.ex02_alerts_recyclerview.domain

import com.tijanidian.alerts_with_mvvm.domain.FileModel

data class AlertModel (
    val id: String,
    val title: String,
    val type: Int,
    val summary: String,
    val datePublished: String,
    val body: String,
    val source: String,
    val files: List<FileModel>
        )

data class FileModel(val name: String, val url: String)