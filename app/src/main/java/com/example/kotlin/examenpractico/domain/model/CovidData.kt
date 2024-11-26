package com.example.kotlin.examenpractico.domain.model

data class CovidData(
    val country: String,
    val region: String,
    val cases: Map<String, CaseInfo>
)

data class CaseInfo(
    val total: Int,
    val new: Int
)

