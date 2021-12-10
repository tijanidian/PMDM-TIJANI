package com.tijanidian.pmpd_playground.ut2.ut02ex06form.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.tijanidian.pmpd_playground.databinding.ActivityListFragmentBinding
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.data.PlayerLocalSource
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.data.local.PlayerFileLocalSource
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.domain.GetPlayerUseCase
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.domain.PlayerRepository
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.presentation.ryceclerview.PlayerAdapter
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.presentation.viewmodel.ListFragmentViewModel

class ListFragment : Fragment() {

private lateinit var binding: ActivityListFragmentBinding

private val viewModel:ListFragmentViewModel by lazy {
    ListFragmentViewModel(GetPlayerUseCase(PlayerFileLocalSource()))
}

    private val playerAdapter= PlayerAdapter()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= ActivityListFragmentBinding.inflate(inflater,container,false)
        return binding.root
        setUpView()
    }



    private fun setUpView(){
        binding.playerList.adapter=playerAdapter
        binding.playerList.layoutManager=LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
    }
    companion object{
        val TAG:String= Ut02ex06Activity::class.java.simpleName
        fun createInstance()= ListFragment()

    }
}