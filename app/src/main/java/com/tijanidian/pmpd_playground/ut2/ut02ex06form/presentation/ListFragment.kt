package com.tijanidian.pmpd_playground.ut2.ut02ex06form.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.tijanidian.pmpd_playground.databinding.ActivityListFragmentBinding
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.presentation.ryceclerview.PlayerAdapter

class ListFragment : Fragment() {

private lateinit var binding: ActivityListFragmentBinding
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

    companion object{
        val TAG:String= Ut02ex06Activity::class.java.simpleName
        fun createInstance()= ListFragment()

    }

    private fun setUpView(){
        binding.playerList.adapter=playerAdapter
        binding.playerList.layoutManager=LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
    }
}