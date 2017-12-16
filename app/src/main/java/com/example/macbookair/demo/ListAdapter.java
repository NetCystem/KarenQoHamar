package com.example.macbookair.demo;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by macbookair on 12/16/17.
 */

public class ListAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater layoutInflater;

    private int[] images = {R.drawable.martin,R.drawable.yervand,R.drawable.bob,R.drawable.bucky,R.drawable.steve,R.drawable.joney_ive};
    private String names[] = {"Martin", "Yervand", "Bob", "Bucky","Steve","Joney"};
    private String[] phone_numbers={"098179899","094880619","041179899","077727088","098524242","077587088"};

    public ListAdapter(Context context) {
        this.context = context;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return names[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        view = layoutInflater.inflate(R.layout.customized_list_view, null);
        ImageView imageView=view.findViewById(R.id.imgView);
        decodeSampledBitmapFromResource(context.getResources(),images[position],100,100);
        imageView.setImageResource(images[position]);
        TextView txt=view.findViewById(R.id.textView);
        txt.setText(names[position]);
        TextView txtPhoneNumber=view.findViewById(R.id.txtPhoneNumber);
        txtPhoneNumber.setText(phone_numbers[position]);
        return view;
    }

    private static Bitmap decodeSampledBitmapFromResource(Resources res, int resId,
                                                         int reqWidth, int reqHeight) {

        // First decode with inJustDecodeBounds=true to check dimensions
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(res, resId, options);

        // Calculate inSampleSize
        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);

        // Decode bitmap with inSampleSize set
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(res, resId, options);
    }

    private static int calculateInSampleSize(
            BitmapFactory.Options options, int reqWidth, int reqHeight) {
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;

        if (height > reqHeight || width > reqWidth) {

            final int halfHeight = height / 2;
            final int halfWidth = width / 2;

            // Calculate the largest inSampleSize value that is a power of 2 and keeps both
            // height and width larger than the requested height and width.
            while ((halfHeight / inSampleSize) >= reqHeight
                    && (halfWidth / inSampleSize) >= reqWidth) {
                inSampleSize *= 2;
            }
        }

        return inSampleSize;
    }
}
