package com.example.recycler_test_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager

class Ejercicio2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio_2)

        var recyclerView = findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.recyclerView1)

        val king = ChessPiece("King", R.drawable.king, "White")
        val queen = ChessPiece("Queen", R.drawable.queen, "White")
        val rook = ChessPiece("Rook", R.drawable.rook, "White")
        val bishop = ChessPiece("Bishop", R.drawable.bishop, "White")
        val pawn = ChessPiece("Pawn", R.drawable.pawn, "White")


        // Creating a list of Pais objects
        val data = mutableListOf<ChessPiece>(
            king,
            queen,
            rook,
            bishop,
            pawn
        )


        var chessPieceAdapter = ChessPieceAdapter(data)

        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@Ejercicio2, LinearLayoutManager.HORIZONTAL, false)
            adapter = chessPieceAdapter
        }

    }

}