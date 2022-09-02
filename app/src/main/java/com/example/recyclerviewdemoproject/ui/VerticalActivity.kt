package com.example.recyclerviewdemoproject.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdemoproject.R
import com.example.recyclerviewdemoproject.adapter.ListItemAdapter
import com.example.recyclerviewdemoproject.model.DataDogClass

class VerticalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vertical)

        val datasets = DataDogClass().allDogs()
        val recyclerV = findViewById<RecyclerView>(R.id.recycler_view)
        val adapter = ListItemAdapter(this, datasets)
        recyclerV.adapter = adapter
        recyclerV.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        recyclerV.setHasFixedSize(true)
    }
}