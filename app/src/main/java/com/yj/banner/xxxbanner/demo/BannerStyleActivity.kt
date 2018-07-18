package com.yj.banner.xxxbanner.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner

import com.yj.banner.xxxbanner.App
import com.yj.banner.xxxbanner.R
import com.yj.banner.xxxbanner.loader.GlideImageLoader
import com.yj.xxxbanner.Banner
import com.yj.xxxbanner.BannerConfig
import kotlinx.android.synthetic.main.activity_banner_style.*


class BannerStyleActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banner_style)
        spinnerStyle.onItemSelectedListener = this
        //默认是CIRCLE_INDICATOR
        (banner as Banner<String>).setImages(App.images)
                .setBannerTitles(App.titles)
                .setImageLoader(GlideImageLoader())
                .start()
    }

    override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
        when (position) {
            0 -> banner.updateBannerStyle(BannerConfig.NOT_INDICATOR)
            1 -> banner.updateBannerStyle(BannerConfig.CIRCLE_INDICATOR)
            2 -> banner.updateBannerStyle(BannerConfig.NUM_INDICATOR)
            3 -> banner.updateBannerStyle(BannerConfig.NUM_INDICATOR_TITLE)
            4 -> banner.updateBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE)
            5 -> banner.updateBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE)
        }
    }

    override fun onNothingSelected(parent: AdapterView<*>) {

    }
}
