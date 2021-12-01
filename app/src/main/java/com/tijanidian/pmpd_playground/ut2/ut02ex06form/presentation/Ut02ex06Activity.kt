package com.tijanidian.pmpd_playground.ut2.ut02ex06form.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.tijanidian.pmpd_playground.R
import com.tijanidian.pmpd_playground.databinding.ActivityUt02ex06Binding
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.data.PlayerLocalData
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.domain.PlayerModel
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.domain.PlayerModelFootball
import java.io.File

class Ut02ex06Activity : AppCompatActivity() {

    private lateinit var playerLocalData: PlayerLocalData

    private val binding: ActivityUt02ex06Binding by lazy {
        ActivityUt02ex06Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        loadForm()
        setupToolbar()
        //testFile()
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
                if (supportActionBar?.title == "Formulario") {
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
        fragmentTransition.replace(layoutId, fragment, "@tijani")
        fragmentTransition.addToBackStack(null)
        fragmentTransition.commit()
    }


    fun testFile(){
                File(this.filesDir, PlayerLocalData.AAD_PLAYER)
                playerLocalData.save(PlayerModelFootball(1,"Ramoncin","Madrid","H","Delantero","Portero"))
                playerLocalData.save(PlayerModelFootball(2,"Pepe","Castilla y león","H","Delantero","Portero"))



    }

}