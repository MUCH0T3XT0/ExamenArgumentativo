// Presentation Layer (Activity)
package com.example.kotlin.examenpractico.framework.view


import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin.examenpractico.framework.adapter.CovidAdapter
import com.example.kotlin.examenpractico.R
import com.example.kotlin.examenpractico.framework.viewmodel.MainViewModel

class   MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModels()
    private lateinit var recyclerView: RecyclerView
    private lateinit var covidAdapter: CovidAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configurar RecyclerView
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Configurar el adaptador
        covidAdapter = CovidAdapter(emptyList())
        recyclerView.adapter = covidAdapter

        // Observar cambios en el ViewModel
        mainViewModel.caseList.observe(this, { caseList ->
            // Actualizar el adaptador con los nuevos datos
            covidAdapter = CovidAdapter(caseList)
            recyclerView.adapter = covidAdapter
        })
    }
}
