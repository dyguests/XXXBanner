package com.yj.banner.xxxbanner.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity


import com.yj.banner.xxxbanner.R
import com.yj.banner.xxxbanner.loader.GlideImageLoader
import com.yj.xxxbanner.Banner
import kotlinx.android.synthetic.main.activity_banner_local.*

import java.util.ArrayList

class BannerLocalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banner_local)
        initView()
    }

    private fun initView() {
        //本地图片数据（资源文件）
        val list = arrayListOf(
                R.mipmap.b1,
                R.mipmap.b2,
                R.mipmap.b3
        )

        (banner as Banner<Int>).setImages(list)
                .setImageLoader(GlideImageLoader())
                .start()
    }
}
