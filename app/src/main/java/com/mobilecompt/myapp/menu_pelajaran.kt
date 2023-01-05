package com.mobilecompt.myapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class menu_pelajaran : AppCompatActivity() {
    private lateinit var btn : Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_pelajaran)
        btn = findViewById(R.id.bab1)
        btn.setOnClickListener {
            startActivity(Intent(this, plj_1::class.java))
        }
        btn = findViewById(R.id.bab2)
        btn.setOnClickListener {
            startActivity(Intent(this, plj_2::class.java))
        }
        btn = findViewById(R.id.bab3)
        btn.setOnClickListener {
            startActivity(Intent(this, plj_3::class.java))
        }
        btn = findViewById(R.id.bab4)
        btn.setOnClickListener {
            startActivity(Intent(this, plj_4::class.java))
        }
        btn = findViewById(R.id.bab5)
        btn.setOnClickListener {
            startActivity(Intent(this, plj_5::class.java))
        }
    }
}