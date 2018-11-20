package com.yj.xxxbanner.view

import android.content.Context
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import kotlin.math.abs


open class BannerViewPager : ViewPager {
    private var scrollable = true
     var scrollToucheAble = true
    private var startX = 0f

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    override fun onTouchEvent(ev: MotionEvent): Boolean {
        return if (!scrollToucheAble) {
            true
        } else {
            if (this.scrollable) {
                if (currentItem == 0 && childCount == 0) {
                    false
                } else super.onTouchEvent(ev)
            } else {
                false
            }
        }

    }

    override fun onInterceptTouchEvent(ev: MotionEvent): Boolean {
        when (ev.action) {
            MotionEvent.ACTION_DOWN -> {
                startX = ev.x
            }
            MotionEvent.ACTION_UP -> {
                if (abs(ev.x - startX) < 5f) {
                    return if (this.scrollable) {
                        if (currentItem == 0 && childCount == 0) {
                            false
                        } else super.onInterceptTouchEvent(ev)
                    } else {
                        false
                    }
                }
            }
        }
        return super.onInterceptTouchEvent(ev)
    }

    fun setScrollable(scrollable: Boolean) {
        this.scrollable = scrollable
    }
}
