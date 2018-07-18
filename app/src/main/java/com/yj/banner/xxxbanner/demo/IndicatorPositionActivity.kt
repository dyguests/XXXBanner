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
import kotlinx.android.synthetic.main.activity_indicator_position.*


class IndicatorPositionActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_indicator_position)
        spinnerPosition.onItemSelectedListener = this

        (banner as Banner<String>).setImages(App.images)
                .setImageLoader(GlideImageLoader())
                .start()
    }

    override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
        when (position) {
            0 -> banner.setIndicatorGravity(BannerConfig.LEFT)
            1 -> banner.setIndicatorGravity(BannerConfig.CENTER)
            2 -> banner.setIndicatorGravity(BannerConfig.RIGHT)
        }
        banner.start()
    }

    override fun onNothingSelected(parent: AdapterView<*>) {

    }
}
