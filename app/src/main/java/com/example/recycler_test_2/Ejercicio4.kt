package com.example.recycler_test_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Ejercicio4 : AppCompatActivity(), OnClickListener {

    lateinit var recyclerViewPacified: RecyclerView
    lateinit var recyclerViewNotPacified: RecyclerView

    fun load_lists(data: MutableList<Pais>)
    {
        Log.v("data_start", data.toString())

        val pacified = data.filter { it.democratizado == true }
        val not_pacified = data.filter { it.democratizado == false }

        Log.v("pacified", pacified.toString())
        Log.v("not_pacified", not_pacified.toString())

        var paisAdapter = PaisAdapter(not_pacified.toMutableList(), pacified.toMutableList(), this)

        recyclerViewNotPacified.apply {
            layoutManager = LinearLayoutManager(this@Ejercicio4)
            adapter = paisAdapter
        }

        var pacificadoAdapter = PaisAdapter(pacified.toMutableList(), not_pacified.toMutableList(), this)

        recyclerViewPacified.apply {
            layoutManager = LinearLayoutManager(this@Ejercicio4)
            adapter = pacificadoAdapter
        }


    }

    override fun onCountryChanged(data: MutableList<Pais>){
        Log.v("onCountryChanged", data.toString())
        load_lists(data)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio_4)

        recyclerViewPacified = findViewById<RecyclerView>(R.id.recyclerView2)
        recyclerViewNotPacified = findViewById<RecyclerView>(R.id.recyclerView1)

        // Creating 10 instances of the Pais class
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


        load_lists(data)





    }




}