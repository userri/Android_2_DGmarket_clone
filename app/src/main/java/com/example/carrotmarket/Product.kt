package com.example.carrotmarket

import java.io.Serializable

data class Product(
    val product_title: String,
    val product_Address: String, // 주소
    val product_price: String,
    val comment_count: Int,
    val like_count: Int,
    val product_img: Int

): Serializable
