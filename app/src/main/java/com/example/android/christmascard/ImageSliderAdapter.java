package com.example.android.christmascard;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ImageSliderAdapter extends AppCompatActivity {

    private ViewPager vp;
    //public int[] img = {R.drawable.sparkles1, R.drawable.sparkles2, R.drawable.sparkles3, R.drawable.sparkles4, R.drawable.sparkles5};
    //private static int RESULT_LOAD_IMAGE = 1;
    //private static final int PICK_FROM_GALLERY = 1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_slider);
        Intent i = getIntent();
        int position = i.getExtras().getInt("id");
        int[] images = i.getExtras().getIntArray("images");
        ViewPagerA viewPager = new ViewPagerA(this, images, position);
        vp = findViewById(R.id.ViewPager);
        vp.setAdapter(viewPager);
    }
}