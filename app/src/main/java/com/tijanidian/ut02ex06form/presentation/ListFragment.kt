package com.tijanidian.ut02ex06form.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tijanidian.pmpd_playground.databinding.ActivityListFragmentBinding

class ListFragment : Fragment() {

private lateinit var binding: ActivityListFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= ActivityListFragmentBinding.inflate(inflater,container,false)
        return binding.root
    }

    companion object{
        val TAG:String= Ut02ex06Activity::class.java.simpleName
        fun createInstance()= ListFragment()

    }

}