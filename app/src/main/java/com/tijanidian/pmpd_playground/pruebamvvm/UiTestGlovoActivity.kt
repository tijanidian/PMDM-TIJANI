package com.tijanidian.pmpd_playground.pruebamvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.ContextCompat
import com.tijanidian.pmpd_playground.R

class UiTestGlovoActivity : AppCompatActivity() {
    //Creamos el objeto del viewModel para poder acceder a los distintos modelos de GlovoModels
    private val globoViewModel = UiTestGlovoViewModel()

    private lateinit var labelTitle: TextView
    private lateinit var secundariText: TextView
    private lateinit var labelPrice: TextView
    private lateinit var LabelTime: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ui_test_glovo)
        setupView()
        renderView()
        changeColorText()
    }

    private fun setupView() {
        labelTitle = findViewById(R.id.text_logo_top1)
        secundariText = findViewById(R.id.text_secundario)
        labelPrice = findViewById(R.id.price_text)
        LabelTime = findViewById(R.id.time_text)

        val imageBackground: AppCompatImageView = findViewById(R.id.backgroud_top)
        imageBackground.setImageResource(R.drawable.glovo_comida)

        val imageBike: AppCompatImageView = findViewById(R.id.bike_icon)
        imageBike.setImageResource(R.drawable.ic_electric_moped_black_24dp)

        val imageLogoGlovo: AppCompatImageView = findViewById(R.id.logo_glovo_principal)
        imageLogoGlovo.setImageResource(R.drawable.ic_glovo_logo)

        val imageWatch: AppCompatImageView = findViewById(R.id.icon_clock)
        imageWatch.setImageResource(R.drawable.ic_watch_later_white_24dp)
    }

    private fun renderView() {
        val globoModel = globoViewModel.getGlovoModel()
        //Texto Principal
        labelTitle.setText(globoModel.principal)
        //Accedemos a ello desde la data class GlovoModel
        secundariText.setText(globoModel.segundario)

        labelPrice.setText(globoModel.leftIcon)

        LabelTime.setText(globoModel.rightIcon)
    }

    private fun changeColorText() {
        val textPrincipal: TextView = findViewById(R.id.text_logo_top1)
        textPrincipal.setTextColor(ContextCompat.getColor(this, R.color.white))

        val textSecundari: TextView = findViewById(R.id.text_secundario)
        textSecundari.setTextColor(ContextCompat.getColor(this, R.color.white))


        val labelPrice: TextView = findViewById(R.id.price_text)
        labelPrice.setTextColor(ContextCompat.getColor(this, R.color.white))

        val rightText: TextView = findViewById(R.id.time_text)
        rightText.setTextColor(ContextCompat.getColor(this, R.color.white))

    }
}