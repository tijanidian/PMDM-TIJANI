package com.tijanidian.pmpd_playground.ut2.ut02ex06form.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.domain.GetPlayerUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ListFragmentViewModel(private val getPlayerUseCase: GetPlayerUseCase):ViewModel() {

    fun getPlayer()=viewModelScope.launch(Dispatchers.IO){
        getPlayerUseCase.execute()
    }
}