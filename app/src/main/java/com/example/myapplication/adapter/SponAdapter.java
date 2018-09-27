package com.example.myapplication.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.myapplication.R;
import com.example.myapplication.bin.SponsorBoardBin;


public class SponAdapter extends RecyclerView.Adapter<SponAdapter.ViewHolder> {
    private int spon_cardview;
    private SponsorBoardBin bin;


    public SponAdapter(int layoutID) {
        bin = new SponsorBoardBin();
        bin.setTitle("test01");
        bin.setContent("test01 content");
        bin.setSthumbnail_uri("https://t1.daumcdn.net/cfile/tistory/23071B425700664239");
        this.spon_cardview = layoutID;

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView thumbnail;
        TextView title, content;


        public ViewHolder(View itemView) {
            super(itemView);
            thumbnail = itemView.findViewById(R.id.spon_item_card_image);
            title = itemView.findViewById(R.id.spon_item_tv1);
            content = itemView.findViewById(R.id.spon_item_tv2);

        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(spon_cardview, parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.title.setText(bin.getTitle());
        holder.content.setText(bin.getContent());
        holder.thumbnail.setImageResource(R.drawable.ic_launcher_background);
        Log.i("asd",bin.getTitle());

    }

    @Override
    public int getItemCount() {
        return 1;

    }

}
