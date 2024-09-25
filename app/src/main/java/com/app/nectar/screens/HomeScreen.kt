package com.app.nectar.screens

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.nectar.R
import com.app.nectar.adapters.ParentItemAdapter
import com.app.nectar.databinding.ActivityHomeBinding
import com.app.nectar.models.ChildItem
import com.app.nectar.models.ParentItem

class HomeScreen : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    private val parentItemList = ArrayList<ParentItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.parentRecyclerView.setHasFixedSize(true)
        binding.parentRecyclerView.layoutManager = LinearLayoutManager(this)

        addDataToList()

        val parentAdapter = ParentItemAdapter(parentItemList)
        binding.parentRecyclerView.adapter = parentAdapter
    }

    private fun addDataToList() {
        val childItemList = ArrayList<ChildItem>()
        childItemList.add(ChildItem(R.drawable.card_item_1, "Organic Bananas", 7.0, "pcs", 4.99))
        childItemList.add(ChildItem(R.drawable.card_item_2, "Red Apple", 1.0, "kg", 4.99))
        childItemList.add(ChildItem(R.drawable.card_item_1, "Organic Bananas", 7.0, "pcs", 4.99))
        childItemList.add(ChildItem(R.drawable.card_item_2, "Red Apple", 1.0, "kg", 4.99))

        parentItemList.add(ParentItem("Exclusive offer", childItemList))

        val childItemList2 = ArrayList<ChildItem>()
        childItemList2.add(ChildItem(R.drawable.card_item_3, "Bell Pepper Red", 1.0, "kg", 4.99))
        childItemList2.add(ChildItem(R.drawable.card_item_4, "Ginger", 250.0, "gm", 4.99))
        childItemList2.add(ChildItem(R.drawable.card_item_3, "Bell Pepper Red", 1.0, "kg", 4.99))
        childItemList2.add(ChildItem(R.drawable.card_item_4, "Ginger", 250.0, "gm", 4.99))


        parentItemList.add(ParentItem("Best Selling", childItemList2))

        val childItemList3 = ArrayList<ChildItem>()
        childItemList3.add(ChildItem(R.drawable.card_item_5, "Bell Bone", 1.0, "kg", 4.99))
        childItemList3.add(ChildItem(R.drawable.card_item_6, "Boiler Chicken", 1.0, "kg", 4.99))
        childItemList3.add(ChildItem(R.drawable.card_item_5, "Bell Bone", 1.0, "kg", 4.99))
        childItemList3.add(ChildItem(R.drawable.card_item_6, "Boiler Chicken", 1.0, "kg", 4.99))

        parentItemList.add(ParentItem("Groceries", childItemList3))
    }
}