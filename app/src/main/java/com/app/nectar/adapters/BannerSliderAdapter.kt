package com.app.nectar.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.app.nectar.R
import com.app.nectar.databinding.BannerSliderItemBinding
import com.app.nectar.models.BannerItem
import com.bumptech.glide.Glide

class BannerSliderAdapter(
    private val context: Context,
    private var imageList: MutableList<BannerItem>
) :
    PagerAdapter() {
    override fun getCount(): Int {
        return imageList.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val binding = BannerSliderItemBinding.inflate(LayoutInflater.from(context), container, false)

        imageList[position].let {
            Glide.with(context).load(it.image).into(binding.imgBanner)
        }

        container.addView(binding.root)
        return binding.root
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}