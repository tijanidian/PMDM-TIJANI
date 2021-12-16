package com.tijanidian.pmpd_playground.ut2.ut02ex06form.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.domain.SavePlayerUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class FromFragmentViewModel(private val savePlayerUseCase: SavePlayerUseCase) : ViewModel() {

    fun savePlayer(param: SavePlayerUseCase.Param) {
        viewModelScope.launch(Dispatchers.IO) {
            savePlayerUseCase.execute(param)
        }
    }
}