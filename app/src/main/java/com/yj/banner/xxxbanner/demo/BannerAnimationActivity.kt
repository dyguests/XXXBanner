package com.yj.banner.xxxbanner.demo


import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.yj.banner.xxxbanner.App
import com.yj.banner.xxxbanner.R
import com.yj.banner.xxxbanner.loader.GlideImageLoader
import com.yj.xxxbanner.Banner
import com.yj.xxxbanner.listener.OnBannerListener
import com.yj.xxxbanner.transformer.*
import kotlinx.android.synthetic.main.activity_banner_animation.*
import kotlinx.android.synthetic.main.text_item.view.*

class BannerAnimationActivity : AppCompatActivity(), OnBannerListener {
    private val transformers: MutableList<Class<out ViewPager.PageTransformer>> by lazy {
        mutableListOf<Class<out ViewPager.PageTransformer>>(
                CubeOutTransformer::class.java,
                AccordionTransformer::class.java,
                BackgroundToForegroundTransformer::class.java,
                ForegroundToBackgroundTransformer::class.java,
                CubeInTransformer::class.java,//兼容问题，慎用
                CubeOutTransformer::class.java,
                DepthPageTransformer::class.java,
                FlipHorizontalTransformer::class.java,
                FlipVerticalTransformer::class.java,
                RotateDownTransformer::class.java,
                RotateUpTransformer::class.java,
                ScaleInOutTransformer::class.java,
                StackTransformer::class.java,
                TabletTransformer::class.java,
                ZoomInTransformer::class.java,
                ZoomOutTranformer::class.java,
                ZoomOutSlideTransformer::class.java
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_banner_animation)
        val data = resources.getStringArray(R.array.anim)
        recycle_view.layoutManager = LinearLayoutManager(this)
        recycle_view.adapter=object :RecyclerView.Adapter<ViewHolder>(){
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder= ViewHolder(layoutInflater.inflate( R.layout.text_item, null))

            override fun getItemCount(): Int =data.size

            override fun onBindViewHolder(holder: ViewHolder, position: Int) {
                holder.onBind(data[position])
                holder.itemView.apply {
                    setOnClickListener {
                        banner.setBannerAnimation(transformers[position])
                    }
                }
            }
        }
        (banner as Banner<String>).setImages(App.images)
                .setImageLoader(GlideImageLoader())
                .setOnBannerListener(this)
                .start()

    }


    override fun onBannerClick(position: Int) {
        Toast.makeText(applicationContext, "你点击了：$position", Toast.LENGTH_SHORT).show()
    }

}

class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
     fun onBind(data:String) {
        itemView.text.text=data

    }
}
