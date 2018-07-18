package com.yj.banner.xxxbanner.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.ViewGroup
import android.widget.RelativeLayout

import com.yj.banner.xxxbanner.App
import com.yj.banner.xxxbanner.R
import com.yj.banner.xxxbanner.loader.GlideImageLoader
import com.yj.xxxbanner.Banner
import com.yj.xxxbanner.listener.OnBannerListener
import kotlinx.android.synthetic.main.activity_custom_view_pager.*


class CustomViewPagerActivity : AppCompatActivity(), OnBannerListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_view_pager)

        banner.layoutParams = RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, App.H / 4)
        //简单使用
        (banner as Banner<String>).setImages(App.images)
                .setImageLoader(GlideImageLoader())
                .setOnBannerListener(this)
                .start()
    }

    override fun onBannerClick(position: Int) {
    }
    //如果你需要考虑更好的体验，可以这么操作
    override fun onStart() {
        super.onStart()
        //开始轮播
        banner.startAutoPlay()
    }

    override fun onStop() {
        super.onStop()
        //结束轮播
        banner.stopAutoPlay()
    }
}
