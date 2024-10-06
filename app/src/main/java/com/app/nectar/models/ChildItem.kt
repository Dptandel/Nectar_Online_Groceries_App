package com.app.nectar.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ChildItem(
    val itemImage: Int,
    val itemName: String,
    val itemQuantity: Double,
    val itemUnit: String,
    val itemPrice: Double,
    val itemDetail: String,
    val review: Double
): Parcelable
