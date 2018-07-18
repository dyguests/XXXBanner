package com.yj.banner.xxxbanner.demo;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


import com.yj.banner.xxxbanner.App;
import com.yj.banner.xxxbanner.R;
import com.yj.banner.xxxbanner.SampleAdapter;
import com.yj.banner.xxxbanner.loader.GlideImageLoader;
import com.yj.xxxbanner.Banner;
import com.yj.xxxbanner.listener.OnBannerListener;
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

import java.util.ArrayList;
import java.util.List;

public class BannerAnimationActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, OnBannerListener {
    Banner<String> banner;
    List<Class<? extends ViewPager.PageTransformer>> transformers=new ArrayList<>();
    public void initData(){
        transformers.add(DefaultTransformer.class);
        transformers.add(AccordionTransformer.class);
        transformers.add(BackgroundToForegroundTransformer.class);
        transformers.add(ForegroundToBackgroundTransformer.class);
        transformers.add(CubeInTransformer.class);//兼容问题，慎用
        transformers.add(CubeOutTransformer.class);
        transformers.add(DepthPageTransformer.class);
        transformers.add(FlipHorizontalTransformer.class);
        transformers.add(FlipVerticalTransformer.class);
        transformers.add(RotateDownTransformer.class);
        transformers.add(RotateUpTransformer.class);
        transformers.add(ScaleInOutTransformer.class);
        transformers.add(StackTransformer.class);
        transformers.add(TabletTransformer.class);
        transformers.add(ZoomInTransformer.class);
        transformers.add(ZoomOutTranformer.class);
        transformers.add(ZoomOutSlideTransformer.class);
    }
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner_animation);
        initData();
        banner = (Banner) findViewById(R.id.banner);
        ListView listView = (ListView) findViewById(R.id.list);
        String[] data = getResources().getStringArray(R.array.anim);
        listView.setAdapter(new SampleAdapter(this, data));
        listView.setOnItemClickListener(this);

        banner.setImages(App.images)
                .setImageLoader(new GlideImageLoader())
                .setOnBannerListener(this)
                .start();

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        banner.setBannerAnimation(transformers.get(position));
    }

    @Override
    public void onBannerClick(int position) {
        Toast.makeText(getApplicationContext(),"你点击了："+position, Toast.LENGTH_SHORT).show();
    }
}
