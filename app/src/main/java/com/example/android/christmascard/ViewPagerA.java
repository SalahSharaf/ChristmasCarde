package com.example.android.christmascard;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import static android.support.v4.app.ActivityCompat.startActivityForResult;


public class ViewPagerA extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutinflater;
    private int[] img;

    public ViewPagerA(Context context, int[] imgResources) {
        this.context = context;
        this.img = imgResources;
    }

    @Override
    public int getCount() {
        return img.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutinflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutinflater.inflate(R.layout.customimage, null);
        ImageView image = view.findViewById(R.id.ImageView);
        image.setImageResource(img[position]);
        image.setScaleType(ImageView.ScaleType.FIT_XY);
        container.addView(view, 0);
        TextView textview = view.findViewById(R.id.ImageNameTextView);
        textview.setText(String.valueOf(img[position]));
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        View view = (View) object;
        container.removeView(view);
    }
}