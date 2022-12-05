package com.example.foodordering.model

data class Food(
    val id: Int,
    val name: String,
    val price: Double,
    val details: String,
    val ingredients: String,
    val rate: Double,
    val calories: Double,
    val reviews: Int,
    val image: String
)
