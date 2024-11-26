// Adapter
package com.example.kotlin.examenpractico.framework.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin.examenpractico.domain.model.CaseInfo

class CovidAdapter(private val data: List<Pair<String, CaseInfo>>) :
    RecyclerView.Adapter<CovidAdapter.CovidViewHolder>() {

    class CovidViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val dateText: TextView = view.findViewById(android.R.id.text1)
        val casesText: TextView = view.findViewById(android.R.id.text2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CovidViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(android.R.layout.simple_list_item_2, parent, false)
        return CovidViewHolder(view)
    }

    override fun onBindViewHolder(holder: CovidViewHolder, position: Int) {
        val (date, caseInfo) = data[position]
        holder.dateText.text = date
        holder.casesText.text = "Total: ${caseInfo.total}, Nuevos: ${caseInfo.new}"
    }

    override fun getItemCount(): Int = data.size
}
