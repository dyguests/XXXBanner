package com.yj.xxxbanner.transformer

import android.view.View

/**
 * desc:
 * time: 2018/5/18
 * @author yinYin
 */
class AlphaTransFormer: ABaseTransformer(false) {
    val maxAlpha = 1f
    override fun onTransform(page: View, position: Float) {
        when {
            position < -1 -> {
                //This page is way off-screen to the left
            }
            position < 0 -> {
                //从左屏划入
                val alpha = 1f + maxAlpha * position
                page.alpha = alpha
            }
            position < 1 -> {
                //向右屏划出
                val alpha = 1 - maxAlpha * position
                page.alpha = alpha
            }
            else -> {
                //This page is way off-screen to the right
            }
        }
    }

}