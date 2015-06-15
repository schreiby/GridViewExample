package com.example.ettie.gridviewexample;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Ettie on 6/15/2015.
 */
public class ImageAdapter extends BaseAdapter {
    private Integer[] imageIdArr = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5};
        Context context;
        public ImageAdapter(Context context) {
            this.context = context;
        }

        @Override
        public int getCount() {
            return imageIdArr.length;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView;
            if (convertView == null) {
                imageView = new ImageView(context);
                imageView.setImageResource(imageIdArr[position]);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

                imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
                imageView.setPadding(5, 5, 5, 5);
            } else {
                imageView = (ImageView)convertView;
            }
            imageView.setImageResource(imageIdArr[position]);
            return imageView;
        }
    }