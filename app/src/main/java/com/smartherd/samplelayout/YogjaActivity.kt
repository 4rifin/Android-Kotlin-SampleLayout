package com.smartherd.samplelayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class YogjaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yogjakarta)
        SetTiltle()
        SetDescription()
    }

    fun SetTiltle() {
      val titleCity: String = resources.getText(R.string.titleCityYogja).toString()
        tvTitleCity.text = titleCity.toString()
    }

    fun SetDescription(){
        val descriptionCity: String = resources.getString(R.string.descriptionCityYogja).toString()
        tvDescriptionCity.text = descriptionCity.toString()
    }
}
