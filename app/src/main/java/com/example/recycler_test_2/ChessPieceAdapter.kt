package com.example.recycler_test_2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ChessPieceAdapter (var datos: MutableList<ChessPiece>): RecyclerView.Adapter<ChessPieceAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.chess_piece, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = datos[position]
        holder.bind(currentItem)
    }

    override fun getItemCount() = datos.size


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Referencias a las vistas dentro de un elemento de la lista
        private var imagenIcono: ImageView = itemView.findViewById(R.id.chess_piece)

        // Método para enlazar datos a las vistas
        fun bind(item: ChessPiece) {
            imagenIcono.setImageResource(item.image)
        }

        // Configurar otras vistas según sea necesario
    }


}