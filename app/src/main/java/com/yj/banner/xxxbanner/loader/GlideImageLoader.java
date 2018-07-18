package com.yj.banner.xxxbanner.loader;

import android.content.Context;
import android.widget.ImageView;

import com.yj.banner.xxxbanner.util.GlideUtil;
import com.yj.xxxbanner.loader.ImageLoaderInterface;


public class GlideImageLoader implements ImageLoaderInterface<ImageView, String> {
    @Override
    public void displayView(Context context, String path, ImageView view) {
        GlideUtil.INSTANCE.loadPicture(view, path);
    }

    @Override
    public ImageView createView(Context context) {
        return new ImageView(context);
    }
}
