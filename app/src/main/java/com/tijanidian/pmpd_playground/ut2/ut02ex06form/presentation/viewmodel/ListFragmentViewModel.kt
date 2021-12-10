package com.tijanidian.pmpd_playground.ut2.ut02ex06form.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.domain.GetPlayerUseCase
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.presentation.ryceclerview.PlayerViewState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ListFragmentViewModel(private val getPlayerUseCase: GetPlayerUseCase) : ViewModel() {

    val playerViewState: LiveData<List<PlayerViewState>>
        get() = _playerViewState

    private val _playerViewState: MutableLiveData<List<PlayerViewState>> by lazy {
        MutableLiveData<List<PlayerViewState>>()
    }

    fun getPlayer() = viewModelScope.launch(Dispatchers.Main) {
        val fechPlayer = getPlayerUseCase.execute()

        _playerViewState.value = fechPlayer.map { player ->
            PlayerViewState(
                player.name,
                player.surname,
                player.community,
                player.gender,
                player.firstPosition,
                player.secondPosition
            )
        }
    }
}