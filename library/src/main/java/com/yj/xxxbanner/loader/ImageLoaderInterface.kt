package com.yj.xxxbanner.loader

import android.content.Context
import android.view.View

import java.io.Serializable


interface ImageLoaderInterface<T : View, in K> : Serializable {
    //对数据进行展示
    fun displayView(context: Context, path: K, view: T)

    //创建View
    fun createView(context: Context): T
}
