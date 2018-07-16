package com.smartherd.samplelayout

data class City(var title: String)

object Cities{
    val listCities = listOf(
            City("Jakarta"),
            City("Bekasi"),
            City("Bandung"),
            City("Yogjakarta"),
            City("Surabaya")
    )
}