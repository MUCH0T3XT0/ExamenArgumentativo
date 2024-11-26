package com.example.kotlin.examenpractico.data.repositories

import android.content.Context
import com.example.kotlin.examenpractico.domain.model.CovidData
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.BufferedReader
import java.io.InputStreamReader

class CovidRepository(private val context: Context) {

    fun getCovidData(): List<CovidData> {
        val jsonData = readJsonFromRaw()
        val gson = Gson()
        val type = object : TypeToken<List<CovidData>>() {}.type
        return gson.fromJson(jsonData, type)
    }

    private fun readJsonFromRaw(): String {
        val inputStream = context.resources.openRawResource(com.example.kotlin.examenpractico.R.raw.covid_data)
        val reader = BufferedReader(InputStreamReader(inputStream))
        return reader.use { it.readText() }
    }
}