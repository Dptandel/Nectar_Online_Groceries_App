package com.app.nectar.models

data class FavouriteItem(
    val id: Int,
    val name: String,
    val quantity: Double,
    val unit: String,
    val price: Double,
    val image: Int
)
