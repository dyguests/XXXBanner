package com.yj.xxxbanner.adapter

import android.support.v4.view.PagerAdapter
import android.view.View
import android.view.ViewGroup

import com.yj.xxxbanner.listener.OnBannerListener

/**
 * desc:
 * time: 2018/7/18
 *
 * @author yinYin
 */
class BannerPagerAdapter(private val views: List<View>, private val listener: OnBannerListener?) : PagerAdapter() {

    override fun getCount(): Int {
        return views.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        container.addView(views[position])
        val view = views[position]

        if (listener != null) {
            view.setOnClickListener { listener.onBannerClick(toRealPosition(position)) }
        }
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    /**
     * 返回真实的位置
     *
     * @param position
     * @return 下标从0开始
     */
    private fun toRealPosition(position: Int): Int {
        var realPosition = (position - 1) % views.size
        if (realPosition < 0)
            realPosition += views.size
        return realPosition
    }
}
