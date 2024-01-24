package com.example.recycler_test_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager

class Ejercicio3 : AppCompatActivity(), OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio_1)

        var recyclerView = findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.recyclerView1)

        val pais1 = Pais("Argentina", true, 120.5f, R.drawable.argentina_flag)
        val pais2 = Pais("Brazil", false, 200.3f, R.drawable.brazil_flag)
        val pais3 = Pais("France", false, 30.8f, R.drawable.france_flag)
        val pais4 = Pais("India", false, 50.2f, R.drawable.india_flag)
        val pais5 = Pais("Japan", false, 15.4f, R.drawable.japan_flag)
        val pais6 = Pais("Mexico", false, 80.0f, R.drawable.mexico_flag)
        val pais7 = Pais("Russia", false, 500.7f, R.drawable.russia_flag)
        val pais8 = Pais("Iran", true, 25.6f, R.drawable.iran_flag)
        val pais9 = Pais("Afghanistan", true, 40.1f, R.drawable.afghanistan_flag)
        val pais10 = Pais("Canada", false, 150.9f, R.drawable.canada_flag)

        // Creating a list of Pais objects
        val data = mutableListOf<Pais>(
            pais1,
            pais2,
            pais3,
            pais4,
            pais5,
            pais6,
            pais7,
            pais8,
            pais9,
            pais10
        )


        var paisAdapter = PaisAdapter(data.toMutableList(),data.toMutableList(),this)

        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@Ejercicio3)
            adapter = paisAdapter
        }

    }

}