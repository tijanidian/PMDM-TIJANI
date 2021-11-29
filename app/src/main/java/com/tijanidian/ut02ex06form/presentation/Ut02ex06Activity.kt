package com.tijanidian.ut02ex06form.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import androidx.fragment.app.Fragment
import com.tijanidian.pmpd_playground.R
import com.tijanidian.pmpd_playground.databinding.ActivityUt02ex06Binding

class Ut02ex06Activity : AppCompatActivity() {
    private val binding:ActivityUt02ex06Binding by lazy{
        ActivityUt02ex06Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setUpView()
        setupToolbar()

    }

    private fun setupToolbar() {
        setSupportActionBar(binding.mainBar)
        supportActionBar?.title = getString(R.string.app_name)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main_manu, menu)
        return true
    }
    fun savePlayer(){
        //binding.name.text

        //val param:SavePlayerUseCase
    }

    private fun setUpView(){
        binding.containerFragment.setOnClickListener {

        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentTransition = supportFragmentManager.beginTransaction()
        //Layout ID, Fragment, TAG
        //fragmentTransition.replace(R.layout.container_fragment, fragment)
        fragmentTransition.commit() //aplica los cambios
    }


}