package com.yj.banner.xxxbanner.loader

import android.content.Context
import android.widget.ImageView

import com.yj.banner.xxxbanner.util.GlideUtil
import com.yj.xxxbanner.loader.ImageLoaderInterface


class LocalImageLoader : ImageLoaderInterface<ImageView, Int> {
    override fun displayView(context: Context, path: Int, view: ImageView) {
        view.setImageResource(path)
    }

    override fun createView(context: Context): ImageView {
        return ImageView(context)
    }
}
