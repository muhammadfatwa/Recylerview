package com.example.myrecycelview

import android.os.Bundle
import android.widget.GridLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecycelview.databinding.ActivityGridBinding

class gridLayout : AppCompatActivity () {
    private var recyclerView: RecyclerView? = null
    private var gridLayoutManager : GridLayoutManager? = null
    private var arrayList:ArrayList<Mobil> ? = null
    private var mobilAdapter:mobilAdapter ? = null


    private lateinit var binding : ActivityGridBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityGridBinding .inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        recyclerView = findViewById(R.id.my_recylerview)

        gridLayoutManager=GridLayoutManager(applicationContext,3,LinearLayoutManager.VERTICAL ,false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        arrayList=ArrayList()
        arrayList=setDataList()
        mobilAdapter= mobilAdapter(applicationContext,arrayList!!)
        recyclerView?.adapter = mobilAdapter


    }

    private fun setDataList ():ArrayList<Mobil> {
        var items : ArrayList<Mobil> = ArrayList()

        items.add(Mobil(R.drawable.lambo,"MOBIL LAMBO"))
        items.add(Mobil(R.drawable.alvard,"MOBIL ALVARD"))
        items.add(Mobil(R.drawable.bmw,"MOBIL BMW"))
        items.add(Mobil(R.drawable.civic,"MOBIL CIVIC"))
        items.add(Mobil(R.drawable.expander,"MOBIL EXPANDER"))
        items.add(Mobil(R.drawable.ferari,"MOBIL FERARI"))
        items.add(Mobil(R.drawable.jeeep,"MOBIL JEEP"))
        items.add(Mobil(R.drawable.pajero,"MOBIL PAJERO"))
        items.add(Mobil(R.drawable.rolle,"MOBIL ROLLE ROYS"))

        return items



    }
}