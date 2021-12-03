package com.tijanidian.pmpd_playground.ut2.ut02ex06form.presentation

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.google.gson.Gson
import com.tijanidian.pmpd_playground.R
import com.tijanidian.pmpd_playground.commons.serializer.GsonSerializer
import com.tijanidian.pmpd_playground.databinding.ActivityUt02ex06Binding
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.data.PlayerLocalData

import com.tijanidian.pmpd_playground.ut2.ut02ex06form.domain.PlayerModelFootball
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.domain.SavePlayerUseCase
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.presentation.ryceclerview.PlayerAdapter
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.presentation.viewmodel.FromFragmentViewModel
import java.io.File

class Ut02ex06Activity : AppCompatActivity() {



    private val localData: PlayerLocalData by lazy {
        PlayerLocalData(this,GsonSerializer(Gson()))
    }

    private val binding: ActivityUt02ex06Binding by lazy {
        ActivityUt02ex06Binding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        loadForm()
        setupToolbar()
        testFile()

    }

    private fun setupToolbar() {
        setSupportActionBar(binding.mainBar)
        supportActionBar?.title = getString(R.string.form_title)

    }


    fun savePlayer() {
        //binding.name.text

        //val param:SavePlayerUseCase
    }



    private fun loadForm(){
        replaceFragment(binding.containerFragment.id,FormFragment.createInstance())
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main_manu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_add -> {
                if (supportActionBar?.title == getString(R.string.form_title)) {
                    replaceFragment(binding.containerFragment.id, FormFragment.createInstance())
                    supportActionBar?.title = getString(R.string.list_title)
                } else {
                    replaceFragment(binding.containerFragment.id, ListFragment.createInstance())
                    supportActionBar?.title = getString(R.string.form_title)
                }
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun replaceFragment(layoutId: Int, fragment: Fragment) {
        val fragmentTransition = supportFragmentManager.beginTransaction()
        fragmentTransition.replace(layoutId, fragment)
        fragmentTransition.addToBackStack(null)
        fragmentTransition.commit()
    }


    fun testFile(){
                val player1=PlayerModelFootball(1,"Tijani","Dian","Castilla y león","H","Delantero","Defensa")
        Thread{
            localData.savePlayer(player1)

        }.start()

        fetch()
    }


    fun fetch(){
        val fetch=localData.fetch()
        Log.d("@dev","$fetch")
    }

   private fun savePlayerFile(){
       //viewModel.savePlayer()
   }

}