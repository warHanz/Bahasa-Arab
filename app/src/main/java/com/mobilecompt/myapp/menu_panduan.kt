package com.mobilecompt.myapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class menu_panduan : AppCompatActivity() {
    private lateinit var btn : Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_panduan)
        btn = findViewById(R.id.bab0)
        btn.setOnClickListener {
            startActivity(Intent(this, pnd_00::class.java))
        }
        btn = findViewById(R.id.bab1)
        btn.setOnClickListener {
            startActivity(Intent(this, pnd_01::class.java))
        }
        btn = findViewById(R.id.bab2)
        btn.setOnClickListener {
            startActivity(Intent(this, pnd_02::class.java))
        }
        btn = findViewById(R.id.bab3)
        btn.setOnClickListener {
            startActivity(Intent(this, pnd_03::class.java))
        }
        btn = findViewById(R.id.bab4)
        btn.setOnClickListener {
            startActivity(Intent(this, pnd_04::class.java))
        }
        btn = findViewById(R.id.bab5)
        btn.setOnClickListener {
            startActivity(Intent(this, pnd_05::class.java))
        }
    }
}