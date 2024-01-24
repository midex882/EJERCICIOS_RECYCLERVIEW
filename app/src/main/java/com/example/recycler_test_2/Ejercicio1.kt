package com.example.recycler_test_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager

class Ejercicio1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio_1)

        var recyclerView = findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.recyclerView1)

        val plato1 = Kebab("Durum", R.drawable.durum, 5.0)
        val plato2 = Kebab("Falafel", R.drawable.falafel, 6.0)
        val plato3 = Kebab("Doner", R.drawable.doner, 4.0)
        val plato4 = Kebab("Pizza", R.drawable.pizza, 8.0)
        val plato5 = Kebab("Plato de kebab", R.drawable.plato, 6.0)

        // Creating a list of Pais objects
        val data = mutableListOf<Kebab>(
            plato1,
            plato2,
            plato3,
            plato4,
            plato5
        )


        var kebabAdapter = KebabAdapter(data)

        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@Ejercicio1)
            adapter = kebabAdapter
        }

    }

}