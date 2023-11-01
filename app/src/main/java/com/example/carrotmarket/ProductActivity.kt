package com.example.carrotmarket

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.carrotmarket.databinding.ProductDetailBinding
import java.io.Serializable

class ProductActivity : AppCompatActivity() {
    lateinit var binding:ProductDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ProductDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
//            product_info = intent.getSerializableExtra("product_info", Product::class.java) ?: "asdf"
            val product_info = intent.getSerializableExtra("product_info", Product::class.java) ?: "asdf" as Product
            val product_img = product_info.product_img
            val product_title = product_info.product_title
            val product_address = product_info.product_address
            val product_price = product_info.product_price

            binding.ivProduct.setImageResource(product_img)
            binding.tvAddress.text = product_address
            binding.tvTitle.text = product_title
            binding.tvPrice.text = product_price

        } else { // 버전이 tiramisu보다 낮을 때
            val product_info = intent.getSerializableExtra("product_info") as Product?
        } ?: Product(1, "temp", "temp","temp", 1, 2)




        binding.backBtn.setOnClickListener{
            finish()
            Log.d("ProductActivity", "backBtn 클릭")
        }

    }
}