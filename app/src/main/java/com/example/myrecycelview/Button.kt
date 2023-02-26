package com.example.myrecycelview

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myrecycelview.databinding.ActivityButtonBinding

class Button :AppCompatActivity () {
    private lateinit var binding  : ActivityButtonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityButtonBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnGrid.setOnClickListener {
            val intent = Intent(this,gridLayout::class.java)
            startActivity(intent)
        }
        binding.btnReycyler.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }

}