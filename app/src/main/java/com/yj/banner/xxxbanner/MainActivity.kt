package com.yj.banner.xxxbanner


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import com.yj.banner.xxxbanner.demo.*
import com.yj.banner.xxxbanner.loader.GlideImageLoader
import com.yj.xxxbanner.Banner
import com.yj.xxxbanner.listener.OnBannerListener
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity(), SwipeRefreshLayout.OnRefreshListener, OnBannerListener {
    private val mHandler = @SuppressLint("HandlerLeak")
    object : Handler() {
        override fun handleMessage(msg: android.os.Message) {
            when (msg.what) {
                REFRESH_COMPLETE -> {
                    val urls = resources.getStringArray(R.array.url4)
                    val list = Arrays.asList(*urls)
                    val arrayList = ArrayList(list)
                    (banner as Banner<String>).update(arrayList)
                    swipe.isRefreshing = false
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        swipe.setOnRefreshListener(this)
        //简单使用
        (banner as Banner<String>).setImages(App.images)
                .setImageLoader(GlideImageLoader())
                .setOnBannerListener(this)
                .start()
        item2.setOnClickListener {
            startActivity(Intent(this, BannerAnimationActivity::class.java))
        }
        item3.setOnClickListener {
            startActivity(Intent(this, IndicatorPositionActivity::class.java))
        }
        item4.setOnClickListener {
            startActivity(Intent(this, CustomBannerActivity::class.java))
        }
        item5.setOnClickListener {
            startActivity(Intent(this, BannerLocalActivity::class.java))
        }
        item6.setOnClickListener {
            startActivity(Intent(this, CustomViewPagerActivity::class.java))
        }
        item7.setOnClickListener {

        }
        item8.setOnClickListener {
            startActivity(Intent(this, OtherTypeActivity::class.java))
        }

    }

    override fun onBannerClick(position: Int) {
        Toast.makeText(applicationContext, "你点击了：$position", Toast.LENGTH_SHORT).show()
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


    override fun onRefresh() {
        mHandler.sendEmptyMessageDelayed(REFRESH_COMPLETE, 2000)
    }

    companion object {
        internal val REFRESH_COMPLETE = 0X1112
    }


}
