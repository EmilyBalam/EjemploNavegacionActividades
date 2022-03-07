package com.example.ejemplonavegacionactividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var boton = findViewById<Button>(R.id.boton)

        boton.setOnClickListener{
            var intent = Intent(this,ActividadB::class.java)
            startActivity(intent)

        }
    }
}