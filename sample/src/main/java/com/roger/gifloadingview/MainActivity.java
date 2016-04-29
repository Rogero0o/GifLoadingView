package com.roger.gifloadingview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.roger.gifloadinglibrary.GifLoadingView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  public static int[] IDS = {
      R.drawable.num0, R.drawable.num1, R.drawable.num2, R.drawable.num3, R.drawable.num4,
      R.drawable.num5, R.drawable.num6, R.drawable.num7, R.drawable.num8, R.drawable.num9,
      R.drawable.num10, R.drawable.num11, R.drawable.num12, R.drawable.num13, R.drawable.num14,
      R.drawable.num15, R.drawable.num16, R.drawable.num17, R.drawable.num18, R.drawable.num19,
      R.drawable.num20, R.drawable.num21, R.drawable.num22, R.drawable.num23
  };

  private RecyclerView mRecyclerView;
  private List<String> mDatas;
  private HomeAdapter mAdapter;
  private GifLoadingView mGifLoadingView;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mRecyclerView = (RecyclerView) findViewById(R.id.id_recyclerview);
    initData();
    mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    mRecyclerView.setAdapter(mAdapter = new HomeAdapter());
    mGifLoadingView = new GifLoadingView();
  }

  protected void initData() {
    mDatas = new ArrayList<String>();
    for (int i = 0; i < 24; i++) {
      mDatas.add("GifLoadingView : " + i);
    }
  }

  class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {

    @Override public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      MyViewHolder holder = new MyViewHolder(
          LayoutInflater.from(MainActivity.this).inflate(R.layout.layout_item, parent, false));
      return holder;
    }

    @Override public void onBindViewHolder(MyViewHolder holder, final int position) {
      holder.ImageButton.setText(mDatas.get(position));
      holder.ImageButton.setOnClickListener(new View.OnClickListener() {
        @Override public void onClick(View v) {
          mGifLoadingView.setImageResource(IDS[position]);
          mGifLoadingView.show(getFragmentManager(), "");
        }
      });
    }

    @Override public int getItemCount() {
      return mDatas.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

      Button ImageButton;

      public MyViewHolder(View view) {
        super(view);
        ImageButton = (Button) view.findViewById(R.id.mButton);
      }
    }
  }
}
