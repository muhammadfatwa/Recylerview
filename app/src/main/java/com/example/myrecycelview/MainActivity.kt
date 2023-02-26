package com.example.myrecycelview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecycelview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding .root)

        var namaKacamata =
            arrayOf("kacamata clearblack","kacamata blackpurple","kacamata tealens","kacamata milktea","kacamata moscot","kacamata pink")
        var imgKacamata = arrayOf(
            R.drawable.clearblack,R.drawable.blackpurple,R.drawable.tealens,R.drawable.milktea,
            R.drawable.moscot,R.drawable.pink
        )
        val kacamataAdapter = KcamataAdapter(namaKacamata,imgKacamata)
        binding.rvData.apply {
            layoutManager=LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            adapter= kacamataAdapter
        }
    }

}