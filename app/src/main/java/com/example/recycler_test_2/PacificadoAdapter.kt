package com.example.recycler_test_2

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler_test_2.databinding.PaisBinding

class PacificadoAdapter (var datos: MutableList<Pais>, var listener: OnClickListener): RecyclerView.Adapter<PacificadoAdapter.ViewHolder>() {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Referencias a las vistas dentro de un elemento de la lista
        private var textoNombre: TextView = itemView.findViewById(R.id.titleLayout)
        private var imagenIcono: ImageView = itemView.findViewById(R.id.picture)
        private var textoPetroleo: TextView = itemView.findViewById(R.id.petroleumLayout)
        private var pacificado: CheckBox = itemView.findViewById(R.id.pacified)

        val binding = PaisBinding.bind(itemView) //esto es para poder acceder a los elementos del layout

//        fun setListener(pais: Pais) {
//            binding.root.setOnLongClickListener {
//                listener.onClick(pais)
//                true
//
//            }
//        }

        // Método para enlazar datos a las vistas
        fun bind(item: Pais) {
            textoNombre.text= item.nombre
            textoPetroleo.text = item.petroleo.toString()+" Toneladas"
            imagenIcono.setImageResource(item.bandera)
            pacificado.isChecked = item.democratizado
        }





        // Configurar otras vistas según sea necesario
    }

    override fun getItemCount() = datos.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.pais, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = datos[position]
        holder.bind(currentItem)

//        holder.setListener(currentItem)

        holder.binding.titleLayout.text = currentItem.nombre
        holder.binding.picture.setImageResource(currentItem.bandera)
        holder.binding.petroleumLayout.text = currentItem.petroleo.toString()+" Toneladas"
        holder.binding.pacified.isChecked = currentItem.democratizado


        holder.binding.pacified.setOnCheckedChangeListener { _, isChecked ->
            currentItem.democratizado = isChecked
//                listener.onCountryChanged(currentItem)
        }


    }


}