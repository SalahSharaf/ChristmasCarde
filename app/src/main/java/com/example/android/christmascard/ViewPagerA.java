package com.example.android.christmascard;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewPagerA extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutinflater;
    private int[] images;
    private ImageView imageview;
    private int positionC;

    public ViewPagerA(Context context, int[] images, int position) {
        this.context = context;
        this.images = images;
        this.positionC = position;
    }

    @Override
    public int getCount() {
        return images.length;
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
        imageview = view.findViewById(R.id.ImageView);
        imageview.setImageResource(images[position]);
        imageview.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        container.addView(view, 0);
        TextView textview = view.findViewById(R.id.ImageNameTextView);
        textview.setText(String.valueOf(images[position]));
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        View view = (View) object;
        container.removeView(view);
    }
}