package com.yj.banner.xxxbanner.loader

import android.content.Context
import android.widget.ImageView

import com.yj.banner.xxxbanner.util.GlideUtil
import com.yj.xxxbanner.loader.LoaderInterface


class GlideImageLoader : LoaderInterface<ImageView, String> {
    override fun displayView(context: Context, bean: String, view: ImageView, position: Int, count: Int) {
        GlideUtil.loadPicture(view, bean)
    }



    override fun createView(context: Context): ImageView {
        return ImageView(context)
    }
}
