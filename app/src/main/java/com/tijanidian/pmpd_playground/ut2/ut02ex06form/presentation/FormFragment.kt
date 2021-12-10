package com.tijanidian.pmpd_playground.ut2.ut02ex06form.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.gson.Gson
import com.tijanidian.pmpd_playground.R
import com.tijanidian.pmpd_playground.commons.serializer.GsonSerializer
import com.tijanidian.pmpd_playground.databinding.ActivityFormFragmentBinding
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.data.local.PlayerFileLocalSource
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.domain.SavePlayerUseCase
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.presentation.viewmodel.FromFragmentViewModel

class FormFragment : Fragment() {
    private lateinit var binding: ActivityFormFragmentBinding


    private val viewModel: FromFragmentViewModel by lazy {
        FromFragmentViewModel(
            SavePlayerUseCase(
                PlayerFileLocalSource(
                    requireContext(),
                    GsonSerializer(Gson())
                )
            )
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ActivityFormFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        actionSave()
    }

    private fun actionSave() {
        binding.actionSavePlayer.setOnClickListener {
            val player = getPlayerParams()
            viewModel.savePlayer(player)
        }
    }

    private fun getPlayerParams(): SavePlayerUseCase.Param {
        val name = binding.inputName.text.toString()
        val surname = binding.inputLastName.text.toString()
        val community = binding.communitiesSpinner.selectedItem.toString()
        val gender = checkBoxGender()
        val position = selectPositionPlayer()

        return SavePlayerUseCase.Param(
            name, surname, community, gender.toString(),
            position.toString(), position.toString()
        )

    }

    private fun checkBoxGender() {
        var opcionSelected: String = " "
        val woman = binding.radioWoman.isChecked
        val man = binding.radioMan.isChecked

        if (woman) {
            opcionSelected = (R.string.opcion_woman.toString())
        } else {
            opcionSelected = (R.string.option_man.toString())
        }

    }

    private fun selectPositionPlayer(): MutableList<String> {
        val position = mutableListOf<String>()
        val portero = binding.ckPortero.isChecked
        val mediocentro = binding.ckMediocentro.isChecked
        val defensa = binding.ckDefensa.isChecked
        val delantero = binding.ckDelantero.isChecked

        if (portero) {
            position.add(R.string.position_portero.toString())
        }
        if (mediocentro) {
            position.add(R.string.position_mediocentro.toString())
        }
        if (defensa) {
            position.add(R.string.position_defensa.toString())
        }
        if (delantero) {
            position.add(R.string.position_delantero.toString())
        }

        return position
    }

    companion object {
        fun createInstance() = FormFragment()
    }
}