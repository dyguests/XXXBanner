package com.yj.xxxbanner.loader

import android.content.Context
import android.view.View
import com.yj.xxxbanner.bean.MultiBannerBean

import java.io.Serializable


interface MultiLoaderInterface<T : View, in K:MultiBannerBean> : Serializable {
    //对数据进行展示
    fun displayView(context: Context, bean: K, view: T,position: Int,count:Int,type:Int)

    //创建View
    fun createView(context: Context,type:Int): T
}
