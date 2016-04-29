package com.roger.gifloadinglibrary;

import android.graphics.Bitmap;

/**
 * Created by Roger on 2016/4/28.
 */
public class BitmapUtil {

  public static int getPixColor(Bitmap src) {
    int pixelColor;
    pixelColor = src.getPixel(5, 5);
    return pixelColor;
  }
}