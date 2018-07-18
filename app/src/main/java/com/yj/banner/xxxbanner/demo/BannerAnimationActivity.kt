package com.yj.banner.xxxbanner.demo


import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.yj.banner.xxxbanner.App
import com.yj.banner.xxxbanner.R
import com.yj.banner.xxxbanner.SampleAdapter
import com.yj.banner.xxxbanner.loader.GlideImageLoader
import com.yj.xxxbanner.Banner
import com.yj.xxxbanner.listener.OnBannerListener
import com.yj.xxxbanner.transformer.*
import kotlinx.android.synthetic.main.activity_banner_animation.*

class BannerAnimationActivity : AppCompatActivity(), AdapterView.OnItemClickListener, OnBannerListener {
    private val transformers: MutableList<Class<out ViewPager.PageTransformer>> by lazy {
        mutableListOf<Class<out ViewPager.PageTransformer>>(
                CubeOutTransformer::class.java,
                AccordionTransformer::class.java,
                BackgroundToForegroundTransformer::class.java,
                ForegroundToBackgroundTransformer::class.java,
                CubeInTransformer::class.java,//兼容问题，慎用
                CubeOutTransformer::class.java,
                DepthPageTransformer::class.java,
                FlipHorizontalTransformer::class.java,
                FlipVerticalTransformer::class.java,
                RotateDownTransformer::class.java,
                RotateUpTransformer::class.java,
                ScaleInOutTransformer::class.java,
                StackTransformer::class.java,
                TabletTransformer::class.java,
                ZoomInTransformer::class.java,
                ZoomOutTranformer::class.java,
                ZoomOutSlideTransformer::class.java
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banner_animation)
        val data = resources.getStringArray(R.array.anim)
        list.adapter = SampleAdapter(this, data)
        list.onItemClickListener = this
        (banner as Banner<String>).setImages(App.images)
                .setImageLoader(GlideImageLoader())
                .setOnBannerListener(this)
                .start()

    }

    override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
        banner.setBannerAnimation(transformers[position])
    }

    override fun onBannerClick(position: Int) {
        Toast.makeText(applicationContext, "你点击了：$position", Toast.LENGTH_SHORT).show()
    }
}
