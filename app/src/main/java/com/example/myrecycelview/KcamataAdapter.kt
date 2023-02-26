package com.example.myrecycelview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class KcamataAdapter(val namaKacamata : Array<String>,val imgKacamata : Array<Int>): RecyclerView.Adapter<KcamataAdapter.MyViewHolder>() {
    class MyViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        val tvKacamata = view.findViewById<TextView>(R.id.txtkachitam)
        val imgKacamta = view.findViewById<ImageView>(R.id.rv_kacamata)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_kacamata,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
       return namaKacamata.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       holder.tvKacamata.text=namaKacamata[position]
        holder.imgKacamta.setImageResource(imgKacamata[position])
        holder.imgKacamta.setOnClickListener {
            Toast.makeText(holder.itemView.context,"${namaKacamata[position]}",Toast.LENGTH_SHORT).show()
        }
    }
}