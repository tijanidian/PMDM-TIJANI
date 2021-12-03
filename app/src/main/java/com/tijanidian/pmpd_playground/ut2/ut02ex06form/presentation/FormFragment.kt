package com.tijanidian.pmpd_playground.ut2.ut02ex06form.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.gson.Gson
import com.tijanidian.pmpd_playground.commons.serializer.GsonSerializer
import com.tijanidian.pmpd_playground.databinding.ActivityFormFragmentBinding
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.data.PlayerLocalData
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.domain.SavePlayerUseCase
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.presentation.viewmodel.FromFragmentViewModel

class FormFragment : Fragment() {
    private lateinit var binding: ActivityFormFragmentBinding

    private val viewModel: FromFragmentViewModel by lazy {
        FromFragmentViewModel(SavePlayerUseCase(PlayerLocalData(requireContext(),
            GsonSerializer(Gson())
        )))
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ActivityFormFragmentBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        actionSave()
    }

    private fun actionSave(){
        binding.actionSavePlayer.setOnClickListener {
            val player=savePlayer()
            viewModel.savePlayer(player)
        }
    }

    private fun savePlayer():SavePlayerUseCase.Param{
        return SavePlayerUseCase.Param(
            binding.inputLastName.text.toString(),
            binding.inputName.text.toString(),
        )
    }

    companion object {
        fun createInstance() = FormFragment()
    }
}