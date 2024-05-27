package com.example.patient_management

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MA_2_loginpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ma2_loginpage)

        val secondactbutton = findViewById(R.id.btnnxtpage2) as Button
        secondactbutton.setOnClickListener{
            Log.d("MA_loginpage","Button clicked")
            val intent = Intent(this,dashboardpage::class.java)
            startActivity(intent)
        }
    }
}