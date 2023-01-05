package com.mobilecompt.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var img: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        img = findViewById(R.id.menu_plj)
        img.setOnClickListener {
            startActivity(Intent(this, menu_pelajaran::class.java))
        }

        img = findViewById(R.id.menu_kms)
        img.setOnClickListener {
            startActivity(Intent(this, menu_kamus::class.java))
        }

        img = findViewById(R.id.menu_lth)
        img.setOnClickListener {
            startActivity(Intent(this, menu_panduan::class.java))
        }
    }
}