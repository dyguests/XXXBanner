package com.yj.banner.xxxbanner.loader

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.yj.banner.xxxbanner.R
import com.yj.banner.xxxbanner.bean.TourismResponse
import com.yj.banner.xxxbanner.util.GlideUtil
import com.yj.banner.xxxbanner.util.SystemUtil
import com.yj.xxxbanner.loader.LoaderInterface
import kotlinx.android.synthetic.main.item_tourism_k6.view.*

/**
 * desc:
 * time: 2018/7/18
 * @author yinYin
 */
class ViewLoader : LoaderInterface<View, TourismResponse> {
    override fun displayView(context: Context, tourismResponse: TourismResponse, view: View, position: Int, count: Int) {
        view.apply {
            tv_title.text = tourismResponse.title?.takeIf { it.isNotBlank() }?.let { "$it" } ?: ""
            tv_content.text = tourismResponse.description ?: ""
            tv_name.text = tourismResponse.userName ?: ""
            tv_address.text = tourismResponse.place ?: ""
            GlideUtil.clearLoad(context, img_head)
            GlideUtil.clearLoad(context, img_picture)
            GlideUtil.loadPicture(img_head, tourismResponse.userPhoto
                    ?: "", R.drawable.login_header_default)
            if (tourismResponse.imageUrl != null && tourismResponse.imageUrl.isNotEmpty()) {
                GlideUtil.loadRoundPicture(img_picture, tourismResponse.imageUrl[0]
                        ?: "", SystemUtil.dip2px(context, 5f).toFloat(), R.drawable.cover_main_banner_empty_holder)
            }

        }
    }



    override fun createView(context: Context): View = LayoutInflater.from(context).inflate(R.layout.item_tourism_k6,null)

}