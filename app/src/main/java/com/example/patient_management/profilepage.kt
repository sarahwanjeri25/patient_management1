package com.example.patient_management

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.ViewCompat


class profilepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profilepage)

        val etName = findViewById(R.id.etName) as EditText
        val etAge = findViewById(R.id.etAge) as EditText
        val etGender = findViewById(R.id.etGender)as EditText
        val etAddress = findViewById(R.id.etAddress)as EditText
        val etPhoneNumber = findViewById(R.id.etPhoneNumber)as EditText
        val etoccupation=findViewById(R.id.etOccupation) as EditText
        val eteducation =findViewById(R.id.etEducation) as EditText
        val etmaritalstatus=findViewById(R.id.etMaritalstatus) as EditText
        val etWeight = findViewById(R.id.etWeight)as EditText
        val etHeight = findViewById(R.id.etHeight)as EditText
        val spinnerMedicalHistory = findViewById(R.id.spinnerMedicalHistory) as Spinner
        val btnsubmit = findViewById(R.id.btnsubmit)as Button
        val btnlogout = findViewById(R.id.btnlogout) as Button

        // Set up the spinner
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.medical_history, R.layout.activity_profilepage
        )
        adapter.setDropDownViewResource(R.layout.activity_profilepage)
        spinnerMedicalHistory.setAdapter(adapter)




        btnsubmit.setOnClickListener(View.OnClickListener {
            val name=etName.text.toString()
            val age=etAge.text.toString()
            val gender=etGender.text.toString()
            val address=etAddress.text.toString()
            val phoneNumber = etPhoneNumber.text.toString().toInt()
            val occupation = etoccupation.text.toString()
            val education =eteducation.text.toString()
            val maritalstatus=etmaritalstatus.text.toString()
            val weight = etWeight.text.toString()
            val height = etHeight.text.toString()
            val medicalHistory =spinnerMedicalHistory.selectedItem.toString()

            // Display a toast message for now
            Toast.makeText(this@profilepage, "Submitted: $name", Toast.LENGTH_SHORT).show()
            Toast.makeText(this@profilepage, "Submitted: $age", Toast.LENGTH_SHORT).show()
            Toast.makeText(this@profilepage, "Submitted: $gender", Toast.LENGTH_SHORT).show()
            Toast.makeText(this@profilepage, "Submitted: $address", Toast.LENGTH_SHORT).show()
            Toast.makeText(this@profilepage, "Submitted: $phoneNumber", Toast.LENGTH_SHORT).show()
            Toast.makeText(this@profilepage, "Submitted: $occupation", Toast.LENGTH_SHORT).show()
            Toast.makeText(this@profilepage, "Submitted: $education", Toast.LENGTH_SHORT).show()
            Toast.makeText(this@profilepage, "Submitted: $maritalstatus", Toast.LENGTH_SHORT).show()
            Toast.makeText(this@profilepage, "Submitted: $weight", Toast.LENGTH_SHORT).show()
            Toast.makeText(this@profilepage, "Submitted: $height", Toast.LENGTH_SHORT).show()
            Toast.makeText(this@profilepage, "Submitted: $medicalHistory", Toast.LENGTH_SHORT).show()

            // Here you can handle the data submission, e.g., send it to a server or save it in a database
        })

        btnlogout.setOnClickListener(View.OnClickListener { // Handle logout logic
            Toast.makeText(this@profilepage, "Logged out", Toast.LENGTH_SHORT).show()
            // Redirect to login screen or close the app
            finish()
        })
    }
}





