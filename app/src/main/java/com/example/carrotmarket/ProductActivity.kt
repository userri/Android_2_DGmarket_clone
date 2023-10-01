package com.example.carrotmarket

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.carrotmarket.databinding.ProductDetailBinding

class ProductActivity : AppCompatActivity() {
    lateinit var binding:ProductDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ProductDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(Color.parseColor("#ff801f"))
        }

        binding.backBtn.setOnClickListener{
            finish()
            Log.d("ProductActivity", "backBtn 클릭")
        }
    }
}