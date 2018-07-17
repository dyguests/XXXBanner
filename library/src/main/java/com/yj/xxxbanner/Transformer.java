package com.yj.xxxbanner;

import android.support.v4.view.ViewPager.PageTransformer;

import com.yj.xxxbanner.transformer.AccordionTransformer;
import com.yj.xxxbanner.transformer.BackgroundToForegroundTransformer;
import com.yj.xxxbanner.transformer.CubeInTransformer;
import com.yj.xxxbanner.transformer.CubeOutTransformer;
import com.yj.xxxbanner.transformer.DefaultTransformer;
import com.yj.xxxbanner.transformer.DepthPageTransformer;
import com.yj.xxxbanner.transformer.FlipHorizontalTransformer;
import com.yj.xxxbanner.transformer.FlipVerticalTransformer;
import com.yj.xxxbanner.transformer.ForegroundToBackgroundTransformer;
import com.yj.xxxbanner.transformer.RotateDownTransformer;
import com.yj.xxxbanner.transformer.RotateUpTransformer;
import com.yj.xxxbanner.transformer.ScaleInOutTransformer;
import com.yj.xxxbanner.transformer.StackTransformer;
import com.yj.xxxbanner.transformer.TabletTransformer;
import com.yj.xxxbanner.transformer.ZoomInTransformer;
import com.yj.xxxbanner.transformer.ZoomOutSlideTransformer;
import com.yj.xxxbanner.transformer.ZoomOutTranformer;

public class Transformer {
    public static Class<? extends PageTransformer> Default = DefaultTransformer.class;
    public static Class<? extends PageTransformer> Accordion = AccordionTransformer.class;
    public static Class<? extends PageTransformer> BackgroundToForeground = BackgroundToForegroundTransformer.class;
    public static Class<? extends PageTransformer> ForegroundToBackground = ForegroundToBackgroundTransformer.class;
    public static Class<? extends PageTransformer> CubeIn = CubeInTransformer.class;
    public static Class<? extends PageTransformer> CubeOut = CubeOutTransformer.class;
    public static Class<? extends PageTransformer> DepthPage = DepthPageTransformer.class;
    public static Class<? extends PageTransformer> FlipHorizontal = FlipHorizontalTransformer.class;
    public static Class<? extends PageTransformer> FlipVertical = FlipVerticalTransformer.class;
    public static Class<? extends PageTransformer> RotateDown = RotateDownTransformer.class;
    public static Class<? extends PageTransformer> RotateUp = RotateUpTransformer.class;
    public static Class<? extends PageTransformer> ScaleInOut = ScaleInOutTransformer.class;
    public static Class<? extends PageTransformer> Stack = StackTransformer.class;
    public static Class<? extends PageTransformer> Tablet = TabletTransformer.class;
    public static Class<? extends PageTransformer> ZoomIn = ZoomInTransformer.class;
    public static Class<? extends PageTransformer> ZoomOut = ZoomOutTranformer.class;
    public static Class<? extends PageTransformer> ZoomOutSlide = ZoomOutSlideTransformer.class;
}
