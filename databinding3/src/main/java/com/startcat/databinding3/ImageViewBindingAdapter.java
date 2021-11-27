package com.startcat.databinding3;

import android.graphics.Color;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;


/**
 * @author duke_zh
 */
public class ImageViewBindingAdapter {

    @BindingAdapter("image")
    public static void setImage(ImageView imageView,String url){
        if (!url.isEmpty()){
            Glide.with(imageView.getContext())
                    .load(url)
                    .placeholder(R.drawable.ic_launcher_background)
                    .into(imageView);
        }else {
            imageView.setBackgroundColor(Color.BLACK);
        }
    }
    //参数可选，网络图片为空时，加载本地图片
    @BindingAdapter(value = {"image","defaultImageRes"},requireAll = false)
    public static void setImage(ImageView imageView,String url,int resId){
        if (!url.isEmpty()){
            Glide.with(imageView.getContext())
                    .load(url)
                    .placeholder(R.drawable.ic_launcher_background)
                    .into(imageView);
        }else {
            imageView.setBackgroundColor(resId);
        }
    }

    @BindingAdapter("image")
    public static void setImage(ImageView imageView,int resId){
       imageView.setImageResource(resId);
    }
}
