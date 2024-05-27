package com.example.patient_management

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class dashboardpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dashboardpage)

        val dropdown = findViewById<Spinner>(R.id.spinner1)
        val items = arrayOf("doctor profile", "patient profile",)
        val adapter = ArrayAdapter(this, R.layout.activity_dashboardpage, items)
        dropdown.adapter = adapter

        val profileiconnxtpage = findViewById(R.id.profileicon) as ImageView
        profileiconnxtpage.setOnClickListener{
            val Intent = Intent(this,profilepage::class.java)
            startActivity(Intent)
        }


    }
}