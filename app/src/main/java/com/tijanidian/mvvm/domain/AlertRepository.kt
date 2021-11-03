package com.tijanidian.mvvm.domain

interface AlertRepository {
    fun getMvvm():AlertModel
    fun saveMvvm(alertModel: AlertModel)
    fun removeMvvm(id:String)
    fun getMvvmAll():List<AlertModel>
}