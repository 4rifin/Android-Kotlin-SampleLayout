package com.smartherd.samplelayout

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class BekasiActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.smartherd.samplelayout.R.layout.activity_bekasi)
        SetTiltle()
        SetDescription()
    }

    fun SetTiltle() {
        val titleCity: String = resources.getText(com.smartherd.samplelayout.R.string.titleCityBekasi).toString()
        tvTitleCity.text = titleCity.toString()
    }

    fun SetDescription(){
        val descriptionCity: String = resources.getString(com.smartherd.samplelayout.R.string.descriptionCityBekasi).toString()
        tvDescriptionCity.text = descriptionCity.toString()
    }

}