package com.yj.banner.xxxbanner.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.yj.banner.xxxbanner.App;
import com.yj.banner.xxxbanner.R;
import com.yj.banner.xxxbanner.loader.GlideImageLoader;
import com.yj.xxxbanner.Banner;
import com.yj.xxxbanner.BannerConfig;


public class CustomBannerActivity extends AppCompatActivity {
    Banner banner1,banner2,banner3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_banner);
        banner1 = (Banner) findViewById(R.id.banner1);
        banner2 = (Banner) findViewById(R.id.banner2);
        banner3 = (Banner) findViewById(R.id.banner3);

        banner1.setImages(App.images)
                .setImageLoader(new GlideImageLoader())
                .start();

        banner2.setImages(App.images)
                .setImageLoader(new GlideImageLoader())
                .start();

        banner3.setImages(App.images)
                .setBannerTitles(App.titles)
                .setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE)
                .setImageLoader(new GlideImageLoader())
                .start();
    }
}
