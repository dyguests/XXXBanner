package com.yj.banner.xxxbanner.loader

import android.content.Context
import android.widget.ImageView

import com.yj.banner.xxxbanner.util.GlideUtil
import com.yj.xxxbanner.loader.ImageLoaderInterface


class GlideImageLoader : ImageLoaderInterface<ImageView, String> {
    override fun displayView(context: Context, path: String, view: ImageView) {
        GlideUtil.loadPicture(view, path)
    }

    override fun createView(context: Context): ImageView {
        return ImageView(context)
    }
}
