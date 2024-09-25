package com.app.nectar.models

data class ParentItem(
    val listTitle: String,
    val childItemList: List<ChildItem>
)
