package com.yj.xxxbanner.view

import android.content.Context
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.MotionEvent


open class BannerViewPager : ViewPager {
    private var scrollable = true

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    override fun onTouchEvent(ev: MotionEvent): Boolean {
        return if (this.scrollable) {
            if (currentItem == 0 && childCount == 0) {
                false
            } else super.onTouchEvent(ev)
        } else {
            false
        }
    }

    override fun onInterceptTouchEvent(ev: MotionEvent): Boolean {
        return if (this.scrollable) {
            if (currentItem == 0 && childCount == 0) {
                false
            } else super.onInterceptTouchEvent(ev)
        } else {
            false
        }
    }

    fun setScrollable(scrollable: Boolean) {
        this.scrollable = scrollable
    }
}
