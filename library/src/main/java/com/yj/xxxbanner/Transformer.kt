package com.yj.xxxbanner

import android.support.v4.view.ViewPager.PageTransformer

import com.yj.xxxbanner.transformer.AccordionTransformer
import com.yj.xxxbanner.transformer.BackgroundToForegroundTransformer
import com.yj.xxxbanner.transformer.CubeInTransformer
import com.yj.xxxbanner.transformer.CubeOutTransformer
import com.yj.xxxbanner.transformer.DefaultTransformer
import com.yj.xxxbanner.transformer.DepthPageTransformer
import com.yj.xxxbanner.transformer.FlipHorizontalTransformer
import com.yj.xxxbanner.transformer.FlipVerticalTransformer
import com.yj.xxxbanner.transformer.ForegroundToBackgroundTransformer
import com.yj.xxxbanner.transformer.RotateDownTransformer
import com.yj.xxxbanner.transformer.RotateUpTransformer
import com.yj.xxxbanner.transformer.ScaleInOutTransformer
import com.yj.xxxbanner.transformer.StackTransformer
import com.yj.xxxbanner.transformer.TabletTransformer
import com.yj.xxxbanner.transformer.ZoomInTransformer
import com.yj.xxxbanner.transformer.ZoomOutSlideTransformer
import com.yj.xxxbanner.transformer.ZoomOutTranformer

object Transformer {
    var Default: Class<out PageTransformer> = DefaultTransformer::class.java
    var Accordion: Class<out PageTransformer> = AccordionTransformer::class.java
    var BackgroundToForeground: Class<out PageTransformer> = BackgroundToForegroundTransformer::class.java
    var ForegroundToBackground: Class<out PageTransformer> = ForegroundToBackgroundTransformer::class.java
    var CubeIn: Class<out PageTransformer> = CubeInTransformer::class.java
    var CubeOut: Class<out PageTransformer> = CubeOutTransformer::class.java
    var DepthPage: Class<out PageTransformer> = DepthPageTransformer::class.java
    var FlipHorizontal: Class<out PageTransformer> = FlipHorizontalTransformer::class.java
    var FlipVertical: Class<out PageTransformer> = FlipVerticalTransformer::class.java
    var RotateDown: Class<out PageTransformer> = RotateDownTransformer::class.java
    var RotateUp: Class<out PageTransformer> = RotateUpTransformer::class.java
    var ScaleInOut: Class<out PageTransformer> = ScaleInOutTransformer::class.java
    var Stack: Class<out PageTransformer> = StackTransformer::class.java
    var Tablet: Class<out PageTransformer> = TabletTransformer::class.java
    var ZoomIn: Class<out PageTransformer> = ZoomInTransformer::class.java
    var ZoomOut: Class<out PageTransformer> = ZoomOutTranformer::class.java
    var ZoomOutSlide: Class<out PageTransformer> = ZoomOutSlideTransformer::class.java
}
