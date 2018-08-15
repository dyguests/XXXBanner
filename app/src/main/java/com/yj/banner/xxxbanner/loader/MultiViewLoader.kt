package com.yj.banner.xxxbanner.loader

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.yj.banner.xxxbanner.R
import com.yj.banner.xxxbanner.bean.MultiTourismResponse
import com.yj.banner.xxxbanner.util.GlideUtil
import com.yj.banner.xxxbanner.util.SystemUtil
import com.yj.xxxbanner.loader.MultiLoaderInterface

/**
 * desc:
 * time: 2018/7/18
 * @author yinYin
 */
class MultiViewLoader : MultiLoaderInterface<View, MultiTourismResponse> {
    override fun displayView(context: Context, tourismResponse: MultiTourismResponse, view: View, position: Int, count: Int,type:Int) {
        view.findViewById<TextView>(R.id.tv_title)
        view.findViewById<TextView>(R.id.tv_title).text = tourismResponse.title?.takeIf { it.isNotBlank() }?.let { "$it" } ?: ""
        view.findViewById<TextView>(R.id.tv_content).text = tourismResponse.description ?: ""
        view.findViewById<TextView>(R.id.tv_name).text = tourismResponse.user_name ?: ""
        view.findViewById<TextView>(R.id.tv_address).text = tourismResponse.place ?: ""
        GlideUtil.clearLoad(context, view.findViewById(R.id.img_head))
        GlideUtil.clearLoad(context ,view.findViewById(R.id.img_picture) )
        GlideUtil.loadPicture(view.findViewById(R.id.img_head), tourismResponse.user_photo
                ?: "", R.drawable.login_header_default)
        if (tourismResponse.image_url != null && tourismResponse.image_url.isNotEmpty()) {
            GlideUtil.loadRoundPicture(view.findViewById(R.id.img_picture), tourismResponse.image_url[0]
                    ?: "", SystemUtil.dip2px(context, 5f).toFloat(), R.drawable.cover_main_banner_empty_holder)
        }

    }



    override fun createView(context: Context,type:Int): View {
        return if (type == 1) {
            LayoutInflater.from(context).inflate(R.layout.item_tourism_k6, null)
        } else {
            LayoutInflater.from(context).inflate(R.layout.item_tourism_k6_1,null)
        }
    }

}