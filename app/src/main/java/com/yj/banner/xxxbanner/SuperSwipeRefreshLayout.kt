package com.yj.banner.xxxbanner


import android.content.Context
import android.support.v4.widget.SwipeRefreshLayout
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.ViewConfiguration


/**
 * 重写SwipeRefreshLayout的onIntercept方法解决与viewpager冲突问题。
 * 思路：
 * 1. 因为下拉刷新，只有纵向滑动的时候才有效，那么我们就判断此时是纵向滑动还是横向滑动就可以了。
 * 2. 纵向滑动就拦截事件，横向滑动不拦截。
 * 3. 怎么判断是纵向滑动还是横向滑动，只要判断Y轴的移动距离大于X轴的移动距离那么就判定为纵向滑动就行了。
 */
class SuperSwipeRefreshLayout(context: Context, attrs: AttributeSet) : SwipeRefreshLayout(context, attrs) {

    private var startY: Float = 0.toFloat()
    private var startX: Float = 0.toFloat()
    // 记录viewPager是否拖拽的标记
    private var mIsVpDrag: Boolean = false
    private val mTouchSlop: Int by lazy {
        ViewConfiguration.get(context).scaledTouchSlop
    }

    override fun onInterceptTouchEvent(ev: MotionEvent): Boolean {
        val action = ev.action
        when (action) {
            MotionEvent.ACTION_DOWN -> {
                // 记录手指按下的位置
                startY = ev.y
                startX = ev.x
                // 初始化标记
                mIsVpDrag = false
            }
            MotionEvent.ACTION_MOVE -> {
                // 如果viewpager正在拖拽中，那么不拦截它的事件，直接return false；
                if (mIsVpDrag) {
                    return false
                }

                // 获取当前手指位置
                val endY = ev.y
                val endX = ev.x
                val distanceX = Math.abs(endX - startX)
                val distanceY = Math.abs(endY - startY)
                // 如果X轴位移大于Y轴位移，那么将事件交给viewPager处理。
                if (distanceX > mTouchSlop && distanceX > distanceY) {
                    mIsVpDrag = true
                    return false
                }
            }
            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL ->
                // 初始化标记
                mIsVpDrag = false
        }
        // 如果是Y轴位移大于X轴，事件交给swipeRefreshLayout处理。
        return super.onInterceptTouchEvent(ev)
    }
}
