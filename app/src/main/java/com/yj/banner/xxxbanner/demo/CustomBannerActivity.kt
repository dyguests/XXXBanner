package com.yj.banner.xxxbanner.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import com.yj.banner.xxxbanner.App
import com.yj.banner.xxxbanner.R
import com.yj.banner.xxxbanner.loader.GlideImageLoader
import com.yj.xxxbanner.Banner
import com.yj.xxxbanner.BannerConfig
import kotlinx.android.synthetic.main.activity_custom_banner.*


class CustomBannerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_banner)


       ( banner1 as Banner<String>).setImages(App.images)
                .setImageLoader(GlideImageLoader())
                .start()

        ( banner2 as Banner<String>).setImages(App.images)
                .setImageLoader(GlideImageLoader())
                .start()

        ( banner3 as Banner<String>).setImages(App.images)
                .setBannerTitles(App.titles)
                .setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE)
                .setImageLoader(GlideImageLoader())
                .start()
    }
}
