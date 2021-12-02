package com.tijanidian.pmpd_playground.ut2.ut02ex06form.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tijanidian.pmpd_playground.databinding.ActivityFormFragmentBinding
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.domain.SavePlayerUseCase

class FormFragment : Fragment() {
    private lateinit var binding: ActivityFormFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ActivityFormFragmentBinding.inflate(inflater, container,false)
        return binding.root
    }

    fun save(){
        /*
        val param: SavePlayerUseCase.Param(
            binding.inputName.text
            binding.inputLastName.text
        )
*/

    }

    companion object {
        fun createInstance() = FormFragment()
    }
}