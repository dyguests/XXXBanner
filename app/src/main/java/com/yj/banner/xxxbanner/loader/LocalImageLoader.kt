package com.yj.banner.xxxbanner.loader

import android.content.Context
import android.widget.ImageView

import com.yj.xxxbanner.loader.LoaderInterface


class LocalImageLoader : LoaderInterface<ImageView, Int> {
    override fun displayView(context: Context, bean: Int, view: ImageView, position: Int, count: Int) {
        view.setImageResource(bean)
    }



    override fun createView(context: Context): ImageView {
        return ImageView(context)
    }
}
