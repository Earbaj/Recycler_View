package com.example.recyclerviewdemoproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.recyclerviewdemoproject.ui.GridActivity
import com.example.recyclerviewdemoproject.ui.HorizontalActivity
import com.example.recyclerviewdemoproject.ui.VerticalActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnV = findViewById<Button>(R.id.btn_vertical)
        val btnH = findViewById<Button>(R.id.btn_horizontal)
        val btnG = findViewById<Button>(R.id.btn_grid)

        btnV.setOnClickListener {
            val intent = Intent(this, VerticalActivity::class.java)
            startActivity(intent)
        }
        btnH.setOnClickListener {
            val intent = Intent(this, HorizontalActivity::class.java)
            startActivity(intent)
        }
        btnG.setOnClickListener {
            val intent = Intent(this, GridActivity::class.java)
            startActivity(intent)
        }
    }
}