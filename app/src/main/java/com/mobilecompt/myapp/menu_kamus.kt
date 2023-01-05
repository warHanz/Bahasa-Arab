package com.mobilecompt.myapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class menu_kamus : AppCompatActivity() {
    private lateinit var btn : Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_kamus)
        btn = findViewById(R.id.bab1)
        btn.setOnClickListener {
            startActivity(Intent(this, kms_1::class.java))
        }
        btn = findViewById(R.id.bab2)
        btn.setOnClickListener {
            startActivity(Intent(this, kms_2::class.java))
        }
        btn = findViewById(R.id.bab3)
        btn.setOnClickListener {
            startActivity(Intent(this, kms_3::class.java))
        }
        btn = findViewById(R.id.bab4)
        btn.setOnClickListener {
            startActivity(Intent(this, kms_4::class.java))
        }
        btn = findViewById(R.id.bab5)
        btn.setOnClickListener {
            startActivity(Intent(this, kms_5::class.java))
        }
    }
}