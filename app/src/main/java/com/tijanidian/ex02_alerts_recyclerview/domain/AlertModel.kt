package com.tijanidian.ex02_alerts_recyclerview.domain

import com.tijanidian.alerts_with_mvvm.domain.FileEntity

data class AlertModel (
    val id: String,
    val title: String,
    val type: Int,
    val summary: String,
    val datePublished: String,
    val body: String,
    val source: String,
    val files: List<FileEntity>
        )

data class FileEntity(val name: String, val url: String)