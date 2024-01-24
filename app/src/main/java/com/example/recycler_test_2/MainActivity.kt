package com.example.recycler_test_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ejercicio1 = findViewById<Button>(R.id.ejercicio1)
        val ejercicio2 = findViewById<Button>(R.id.ejercicio2)
        val ejercicio3 = findViewById<Button>(R.id.ejercicio3)
        val ejercicio4 = findViewById<Button>(R.id.ejercicio4)

        ejercicio1.setOnClickListener{
            val intent = Intent(this, Ejercicio1::class.java)
            startActivity(intent)
        }

        ejercicio2.setOnClickListener{
            val intent = Intent(this, Ejercicio2::class.java)
            startActivity(intent)
        }

        ejercicio3.setOnClickListener{
            val intent = Intent(this, Ejercicio3::class.java)
            startActivity(intent)
        }

        ejercicio4.setOnClickListener{
            val intent = Intent(this, Ejercicio4::class.java)
            startActivity(intent)
        }
    }
}