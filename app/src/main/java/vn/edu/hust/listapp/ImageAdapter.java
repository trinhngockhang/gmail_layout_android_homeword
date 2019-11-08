package vn.edu.hust.listapp;

import android.content.Context;
import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    Context context;
    Integer[] thumbnails;

    public ImageAdapter(Context context, Integer[] thumbnails) {
        this.context = context;
        this.thumbnails = thumbnails;
    }

    @Override
    public int getCount() {
        return thumbnails.length;
    }

    @Override
    public Object getItem(int i) {
        return thumbnails[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView;
        if (view == null)
        {
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(300, 300));
        }
        else
        {
            imageView = (ImageView) view;
        }

        imageView.setImageResource(thumbnails[i]);

        return imageView;
    }
}
