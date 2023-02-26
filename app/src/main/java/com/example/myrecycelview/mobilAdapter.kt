package com.example.myrecycelview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class mobilAdapter (var context: Context,var arrayList: ArrayList<Mobil>):
    RecyclerView.Adapter<mobilAdapter.ItemHolder> () {

    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgmobil : ImageView = itemView.findViewById(R.id.img_mobil)
        val tvmobil : TextView= itemView.findViewById(R.id.jn_mobil)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder{
        val itemHolder = LayoutInflater.from(parent.context)
            .inflate(R.layout.grid_listitem,parent,false)
        return ItemHolder(itemHolder)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        var mobil:Mobil = arrayList.get(position)

        holder.imgmobil.setImageResource(mobil.merek !!)
        holder.tvmobil.text = mobil.mobil
        holder.imgmobil.setOnClickListener { 
            Toast.makeText(context,mobil.mobil,Toast.LENGTH_SHORT).show()
        }





    }


}