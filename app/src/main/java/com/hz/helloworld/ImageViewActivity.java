package com.hz.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {

    private ImageView iv_1;
    private ImageView iv_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        iv_1 = (ImageView)findViewById(R.id.iv_1);
        iv_1.setImageResource(R.drawable.ironman);
        iv_2 = (ImageView)findViewById(R.id.iv_2);
        iv_2.setImageResource(R.drawable.ironman);

        Glide.with(ImageViewActivity.this).load("https://lh6.ggpht.com/9SZhHdv4URtBzRmXpnWxZcYhkgTQurFuuQ8OR7WZ3R7fyTmha77dYkVvcuqMu3DLvMQ=w300").into(iv_2);
        Glide.with(ImageViewActivity.this)
                .load("https://www.sciencemag.org/sites/default/files/styles/article_main_image_-_1280w__no_aspect_/public/dogs_1280p_0.jpg?itok=6jQzdNB8")
                .into(iv_1);
    }
}