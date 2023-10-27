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
        val data = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getSerializableExtra("product_info", Product::class.java) ?: "asdf"
        } else { // 버전이 tiramisu보다 낮을 때
            intent.getSerializableExtra("product_info") as Product?
        } ?: Product(1, "temp", "temp","temp", 1, 2)

        binding.backBtn.setOnClickListener{
            finish()
            Log.d("ProductActivity", "backBtn 클릭")
        }

    }
}