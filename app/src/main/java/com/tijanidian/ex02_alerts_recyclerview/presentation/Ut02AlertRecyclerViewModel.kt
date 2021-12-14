package com.tijanidian.ex02_alerts_recyclerview.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tijanidian.ex02_alerts_recyclerview.domain.GetAlertUserCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Ut02AlertRecyclerViewModel(private val getAlertUseCase: GetAlertUserCase) : ViewModel() {

    //Creamos la variable de forma pública para los observadores
    val alertViewState: LiveData<List<AlertViewState>>
        get() = _alertViewState


    //Variable que nos sirve para fijarnos en los cambios y notificar sus cambios
    private val _alertViewState: MutableLiveData<List<AlertViewState>> by lazy {
        MutableLiveData<List<AlertViewState>>()
    }

    fun fetchAlerts() = viewModelScope.launch(Dispatchers.IO) {
        val alerts = getAlertUseCase.execute()
        _alertViewState.postValue(alerts.map { AlertViewState.fromAlertModel(it) })
    }

}