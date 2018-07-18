package com.yj.banner.xxxbanner

import android.app.Application
import android.content.Context
import android.util.DisplayMetrics


import java.util.ArrayList
import java.util.Arrays


class App : Application() {
    override fun onCreate() {
        super.onCreate()
        getScreen(this)
        val urls = resources.getStringArray(R.array.url)
        val tips = resources.getStringArray(R.array.title)
        val list = Arrays.asList(*urls)
        images = ArrayList(list)
        val list1 = Arrays.asList(*tips)
        titles = ArrayList(list1)
    }

    fun getScreen(aty: Context) {
        val dm = aty.resources.displayMetrics
        H = dm.heightPixels
        W = dm.widthPixels
    }

    companion object {
        var images: List<String> = ArrayList()
        var titles: List<String> = ArrayList()
        var H: Int = 0
        var W: Int = 0

    }
}
