package com.app.nectar.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.nectar.R
import com.app.nectar.adapters.BannerSliderAdapter
import com.app.nectar.adapters.ParentItemAdapter
import com.app.nectar.databinding.FragmentShopBinding
import com.app.nectar.models.BannerItem
import com.app.nectar.models.ChildItem
import com.app.nectar.models.ParentItem
import me.relex.circleindicator.CircleIndicator

class ShopFragment : Fragment() {

    private lateinit var binding: FragmentShopBinding

    private val parentItemList = ArrayList<ParentItem>()

    private lateinit var bannerAdapter : BannerSliderAdapter

    private val bannerItemList : MutableList<BannerItem> = mutableListOf()

    private lateinit var indicator: CircleIndicator

    private var banner: BannerItem? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentShopBinding.inflate(inflater, container, false)

        //bannerImages
        bannerItemList.apply {
            add(BannerItem(R.drawable.home_banner))
            add(BannerItem(R.drawable.home_banner))
            add(BannerItem(R.drawable.home_banner))
        }

        binding.parentRecyclerView.layoutManager = LinearLayoutManager(context)

        addDataToList()

        val parentAdapter = ParentItemAdapter(parentItemList)
        binding.parentRecyclerView.adapter = parentAdapter

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        banner?.image.apply {
            bannerAdapter = BannerSliderAdapter(requireContext(), bannerItemList)
            binding.viewpager.adapter = bannerAdapter
//            indicator = requireView().findViewById(R.id.indicator)!!
            binding.indicator.setViewPager(binding.viewpager)
        }
    }

    private fun addDataToList() {
        val childItemList = ArrayList<ChildItem>()
        childItemList.add(
            ChildItem(
                R.drawable.card_item_1,
                "Organic Bananas",
                7.0,
                "pcs",
                4.99,
                "Bananas are nutrient-dense fruits, rich in potassium, vitamin B6, and fiber. They provide quick energy due to their carbohydrate content and may support heart health, digestion, and muscle function. Bananas are versatile, convenient, and can be a healthy addition to various diets.",
                4.0
            )
        )
        childItemList.add(
            ChildItem(
                R.drawable.card_item_2,
                "Red Apple",
                1.0,
                "kg",
                4.99,
                "Apples are nutritious, low-calorie fruits rich in fiber, antioxidants, and vitamins. Their high fiber content promotes fullness, potentially aiding weight loss, while their nutrients may help reduce the risk of chronic diseases. Regular apple consumption can be a simple, delicious way to improve overall diet quality and health.",
                4.5
            )
        )
        childItemList.add(
            ChildItem(
                R.drawable.card_item_1,
                "Organic Bananas",
                7.0,
                "pcs",
                4.99,
                "Bananas are nutrient-dense fruits, rich in potassium, vitamin B6, and fiber. They provide quick energy due to their carbohydrate content and may support heart health, digestion, and muscle function. Bananas are versatile, convenient, and can be a healthy addition to various diets.",
                4.0
            )
        )
        childItemList.add(
            ChildItem(
                R.drawable.card_item_2,
                "Red Apple",
                1.0,
                "kg",
                4.99,
                "Apples are nutritious, low-calorie fruits rich in fiber, antioxidants, and vitamins. Their high fiber content promotes fullness, potentially aiding weight loss, while their nutrients may help reduce the risk of chronic diseases. Regular apple consumption can be a simple, delicious way to improve overall diet quality and health.",
                4.5
            )
        )
        parentItemList.add(ParentItem("Exclusive offers", childItemList))

        val childItemList2 = ArrayList<ChildItem>()
        childItemList2.add(
            ChildItem(
                R.drawable.card_item_3,
                "Bell Pepper Red",
                1.0,
                "kg",
                4.99,
                "Red bell peppers are low in calories and exceptionally high in vitamin C, with one pepper providing over 200% of the daily recommended intake. They're also rich in antioxidants, particularly carotenoids like beta-carotene and lycopene, which may promote eye health and reduce the risk of certain chronic diseases.",
                3.5
            )
        )
        childItemList2.add(
            ChildItem(
                R.drawable.card_item_4,
                "Ginger",
                250.0,
                "gm",
                4.99,
                "Ginger is a potent root with strong anti-inflammatory and antioxidant properties. It may help alleviate nausea, reduce muscle pain, lower blood sugar levels, and aid digestion. Ginger can be consumed fresh, dried, or as a tea, and is widely used in both culinary and medicinal applications.",
                4.0
            )
        )
        childItemList2.add(
            ChildItem(
                R.drawable.card_item_3,
                "Bell Pepper Red",
                1.0,
                "kg",
                4.99,
                "Red bell peppers are low in calories and exceptionally high in vitamin C, with one pepper providing over 200% of the daily recommended intake. They're also rich in antioxidants, particularly carotenoids like beta-carotene and lycopene, which may promote eye health and reduce the risk of certain chronic diseases.",
                3.5
            )
        )
        childItemList2.add(
            ChildItem(
                R.drawable.card_item_4,
                "Ginger",
                250.0,
                "gm",
                4.99,
                "Ginger is a potent root with strong anti-inflammatory and antioxidant properties. It may help alleviate nausea, reduce muscle pain, lower blood sugar levels, and aid digestion. Ginger can be consumed fresh, dried, or as a tea, and is widely used in both culinary and medicinal applications.",
                4.0
            )
        )
        parentItemList.add(ParentItem("Best Selling", childItemList2))

        val childItemList3 = ArrayList<ChildItem>()
        childItemList3.add(
            ChildItem(
                R.drawable.card_item_5,
                "Bell Bone",
                1.0,
                "kg",
                4.99,
                "A bell bone is a type of bone typically found in certain cuts of meat, such as beef shank. It has a distinctive, bell-like shape and is known for its rich marrow content.",
                4.5
            )
        )
        childItemList3.add(
            ChildItem(
                R.drawable.card_item_6,
                "Boiler Chicken",
                1.0,
                "kg",
                4.99,
                "Boiler chicken refers to a type of poultry raised specifically for meat production, often known for its fast growth and tender meat.",
                5.0
            )
        )
        childItemList3.add(
            ChildItem(
                R.drawable.card_item_5,
                "Bell Bone",
                1.0,
                "kg",
                4.99,
                "A bell bone is a type of bone typically found in certain cuts of meat, such as beef shank. It has a distinctive, bell-like shape and is known for its rich marrow content.",
                4.5
            )
        )
        childItemList3.add(
            ChildItem(
                R.drawable.card_item_6,
                "Boiler Chicken",
                1.0,
                "kg",
                4.99,
                "Boiler chicken refers to a type of poultry raised specifically for meat production, often known for its fast growth and tender meat.",
                5.0
            )
        )
        parentItemList.add(ParentItem("Groceries", childItemList3))
    }
}