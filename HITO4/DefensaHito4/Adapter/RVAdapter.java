package com.example.hito4ronaldlluscoreciclerview.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hito4ronaldlluscoreciclerview.R;
import com.example.hito4ronaldlluscoreciclerview.playlist;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<ViewHolder> {
    private static final String TAG = "RVAdapter";

    private Context context;
    //nueva

    //nueva
    private ArrayList<String> imageNames = new ArrayList<>();
    private ArrayList<String> images = new ArrayList<>();


    public RVAdapter(Context context, ArrayList<String> imageNames,ArrayList<String> images) {
        this.context = context;
        this.imageNames = imageNames;
        this.images = images;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rl_list_item, viewGroup,false);
        ViewHolder vHolder =new ViewHolder(view);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        String url = "https://i.imgur.com/";
        //set image
        Glide.with(context)
                .asBitmap()
                .load(url + images.get(position)+".png") //images.get(position)
                .into(holder.getCircleImage());
        holder.getTvImage().setText(imageNames.get(position));
        holder.getTvImage().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"My "+ imageNames.get(position),Toast.LENGTH_SHORT).show();
            }
        });
        holder.getContext();

        //eventos
        holder.getEscuchar().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, playlist.class);
                context.startActivity(intent);
            }
        });

        holder.getNeww().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, playlist2.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return imageNames.size();
    }



}
