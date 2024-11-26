package com.example.kotlin.examenpractico.framework.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.kotlin.examenpractico.data.repositories.CovidRepository
import com.example.kotlin.examenpractico.domain.model.CaseInfo

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val covidRepository = CovidRepository(application)

    private val _caseList = MutableLiveData<List<Pair<String, CaseInfo>>>()
    val caseList: LiveData<List<Pair<String, CaseInfo>>> = _caseList

    init {
        loadCovidData()
    }

    private fun loadCovidData() {
        val covidData = covidRepository.getCovidData()
        val mexicoData = covidData.firstOrNull { it.country == "Mexico" }
        val cases = mexicoData?.cases?.toList() ?: emptyList()
        _caseList.value = cases
    }
}