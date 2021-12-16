package com.tijanidian.pmpd_playground.mvvm.domain

import java.util.*

data class MvvmModel (
    val id: Int,
    val title: String,
    val description:String,
    val mvvmDetailsModel: MvvmDetailsModel,
    val photosModel: List<PhotoModel>

    )


data class  MvvmDetailsModel(val longDescription:String,val startDate: Date)

data class  PhotoModel(val url:String,val description:String)