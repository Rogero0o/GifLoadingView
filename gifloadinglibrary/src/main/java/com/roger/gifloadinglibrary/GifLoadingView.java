package com.roger.gifloadinglibrary;

import android.app.Dialog;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Gravity;

import fr.tvbarthel.lib.blurdialogfragment.BlurDialogFragment;
import pl.droidsonroids.gif.GifImageView;

/**
 * Created by Roger on 2016/4/28.
 */
public class GifLoadingView extends BlurDialogFragment {

  private Dialog mDialog;
  private GradientDrawable gd;
  private int mRadius = 10, tempRadius = 10;
  private float mDownScaleFactor = 5.0f, tempDownScaleFactor = 5.0f;
  private boolean mDimming = true;
  private boolean mBlurredActionBar = false;
  private int CornerRadius = 30;
  private int backGroundColor = Color.parseColor("#001991EC");
  private GifImageView mGifImageView;
  private int id;

  @Override public Dialog onCreateDialog(Bundle savedInstanceState) {
    if (mDialog == null) {
      mDialog = new Dialog(getActivity(), R.style.gif_dialog);
      mDialog.setContentView(R.layout.gifloading_main);
      mDialog.setCanceledOnTouchOutside(true);
      mDialog.getWindow().setGravity(Gravity.CENTER);
      gd = new GradientDrawable();
      gd.setCornerRadius(CornerRadius);
      mGifImageView = (GifImageView) mDialog.findViewById(R.id.gifImageView);
      if (id == 0) {
        id = R.drawable.m;
      }
      setBackGroundColor(BitmapUtil.getPixColor(BitmapFactory.decodeResource(getResources(), id)));
      mGifImageView.setImageResource(id);
      gd.setColor(backGroundColor);
      mDialog.findViewById(R.id.mBackground).setBackground(gd);
    }
    return mDialog;
  }

  private void setResource() {
    if (mDialog == null) {
      return;
    }
    setBackGroundColor(BitmapUtil.getPixColor(BitmapFactory.decodeResource(getResources(), id)));
    mGifImageView.setImageResource(id);
    gd.setColor(backGroundColor);
    mDialog.findViewById(R.id.mBackground).setBackground(gd);
  }

  @Override public void onDismiss(DialogInterface dialog) {
    super.onDismiss(dialog);
    mDialog = null;
  }

  public void show(FragmentManager fragmentManager){
    show(fragmentManager,"");
  }

  public void setImageResource(int id) {
    this.id = id;
    setResource();
  }

  public void setBackgroundResource(int id) {
    this.id = id;
    setResource();
  }

  public GifImageView getmGifImageView() {
    return mGifImageView;
  }

  public void setBlurredActionBar(boolean mBlurredActionBar) {
    this.mBlurredActionBar = mBlurredActionBar;
  }

  public void setCornerRadius(int cornerRadius) {
    CornerRadius = cornerRadius;
  }

  public void setBackGroundColor(int backGroundColor) {
    this.backGroundColor = backGroundColor;
    gd.setColor(backGroundColor);
    mDialog.findViewById(R.id.mBackground).setBackground(gd);
  }

  public void setRadius(int mRadius) {
    this.mRadius = mRadius;
  }

  public void setDownScaleFactor(float mDownScaleFactor) {
    this.mDownScaleFactor = mDownScaleFactor;
  }

  public void setDimming(boolean mDimming) {
    this.mDimming = mDimming;
  }

  @Override protected boolean isDimmingEnable() {
    return mDimming;
  }

  @Override protected boolean isActionBarBlurred() {
    return mBlurredActionBar;
  }

  @Override protected float getDownScaleFactor() {
    return mDownScaleFactor;
  }

  @Override protected int getBlurRadius() {
    return mRadius;
  }

  @Override protected boolean isDebugEnable() {
    return false;
  }
}
