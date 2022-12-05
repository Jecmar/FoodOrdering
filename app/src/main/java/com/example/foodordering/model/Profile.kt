package com.example.foodordering.model

data class Profile(
    val id: Int,
    val name: String,
    val lastname: String,
    val number: String,
    val email: String,
    val language: String,
    val enableNotification: Boolean
)
