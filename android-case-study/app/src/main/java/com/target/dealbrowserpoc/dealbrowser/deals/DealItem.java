package com.target.dealbrowserpoc.dealbrowser.deals;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class DealItem {
    public int index;
    public String id;
    public String title;
    public String description;
    public String originalPrice;
    public String salePrice;
    public int image;
    public String aisle;

    public DealItem(int index, String id, String title, String description, String originalPrice, String salePrice, int image, String aisle) {
        this.index = index;
        this.id = id;
        this.title = title;
        this.description = description;
        this.originalPrice = originalPrice;
        this.salePrice = salePrice;
        this.image = image;
        this.aisle = aisle;
    }

    public Bitmap getProductImage(Context context){
        Bitmap bmp = BitmapFactory.decodeResource(context.getResources(), image);
        return bmp;
    }

    @Override
    public String toString() {
        return title;
    }
}