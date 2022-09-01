package com.example.recyclerviewdemoproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnV = findViewById<Button>(R.id.btn_vertical)
        val btnH = findViewById<Button>(R.id.btn_horizontal)
        val btnG = findViewById<Button>(R.id.btn_grid)

        btnV.setOnClickListener {  }
        btnH.setOnClickListener {  }
        btnG.setOnClickListener {  }
    }
}