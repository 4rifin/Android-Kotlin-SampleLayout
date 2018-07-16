package com.smartherd.samplelayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SetTiltle()
        SetDescription()
    }

    fun SetTiltle() {
      val titleCity: String = resources.getText(R.string.titleCityJakarta).toString()
        tvTitleCity.text = titleCity.toString()
    }

    fun SetDescription(){
        val descriptionJakarta: String = resources.getString(R.string.descriptionCityJakarta).toString()
        tvDescriptionCity.text = descriptionJakarta.toString()
    }
}
