package com.example.recycler_test_2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KebabAdapter (var datos: MutableList<Kebab>): RecyclerView.Adapter<KebabAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.kebab, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = datos[position]
        holder.bind(currentItem)
    }

    override fun getItemCount() = datos.size


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Referencias a las vistas dentro de un elemento de la lista
        private var imagenIcono: ImageView = itemView.findViewById(R.id.picture)
        private var nombre : TextView = itemView.findViewById(R.id.titleLayout)
        private var precio : TextView = itemView.findViewById(R.id.priceLayout)

        // Método para enlazar datos a las vistas
        fun bind(item: Kebab) {
            imagenIcono.setImageResource(item.image)
            nombre.text = item.name
            precio.text = item.price.toString()
        }

        // Configurar otras vistas según sea necesario
    }


}