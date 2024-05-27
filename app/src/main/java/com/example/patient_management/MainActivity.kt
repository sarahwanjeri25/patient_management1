package com.example.patient_management

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val firstactbutton = findViewById(R.id.btnnxtpage1) as Button
        firstactbutton.setOnClickListener{
            val intent = Intent(this,MA_2_loginpage::class.java)
            startActivity(intent)
        }
    }
}