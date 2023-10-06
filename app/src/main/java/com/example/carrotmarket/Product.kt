package com.example.carrotmarket

data class Product(
    val product_img: Int,
    val product_title: String,
    val product_id: String, // 주소
    val product_price: String,
    val comment_count: Int,
    val like_count: Int

)
