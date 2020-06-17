package com.example.hito4ronaldlluscoreciclerview.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hito4ronaldlluscoreciclerview.R;
import com.example.hito4ronaldlluscoreciclerview.playlist;

import java.util.ArrayList;

public class RVAdapter1 extends RecyclerView.Adapter<ViewHolder1> {
    private static final String TAG = "RVAdapter1";
    private Context context;
    //nueva
    private ArrayList<String> imageNames = new ArrayList<>();
    private ArrayList<String> images = new ArrayList<>();
    private ArrayList<String> imagespause = new ArrayList<>();
    private ArrayList<String> imagesstop = new ArrayList<>();


    public RVAdapter1(Context context, ArrayList<String> imageNames, ArrayList<String> images, ArrayList<String> imagespause, ArrayList<String> imagesstop) {
        this.context = context;
        this.imageNames = imageNames;
        this.images = images;
        this.imagespause = imagespause;
        this.imagesstop = imagesstop;

    }
    @Override
    public ViewHolder1 onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rl_list_item1, viewGroup,false);
        ViewHolder1 vHolder =new ViewHolder1(view);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder1  holder, final int position1) {
        String url = "https://i.imgur.com/";
        //set image
        Glide.with(context)
                .asBitmap()
                .load(url + images.get(position1)+".png") //images.get(position)
                .into(holder.getCircleImage1());
        Glide.with(context)
                .asBitmap()
                .load(url + imagespause.get(position1)+".png") //images.get(position)
                .into(holder.getCircleImage2());
        Glide.with(context)
                .asBitmap()
                .load(url + imagesstop.get(position1)+".png") //images.get(position)
                .into(holder.getCircleImage3());

        holder.getTvImage().setText(imageNames.get(position1));
        holder.getCircleImage1().setVisibility(View.VISIBLE);
        holder.getCircleImage2().setVisibility(View.INVISIBLE);


        holder.getCircleImage1().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Play Music: " + (position1+1),Toast.LENGTH_SHORT).show();

                holder.getCircleImage1().setVisibility(View.INVISIBLE);
                holder.getCircleImage2().setVisibility(View.VISIBLE);
            }
        });


        holder.getCircleImage2().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Pause Music: " + (position1+1),Toast.LENGTH_SHORT).show();

                holder.getCircleImage1().setVisibility(View.VISIBLE);
                holder.getCircleImage2().setVisibility(View.INVISIBLE);
            }
        });
        holder.getCircleImage3().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Stop Music: " + (position1+1),Toast.LENGTH_SHORT).show();
            }
        });

   //  Toast.makeText(context,"My "+ imageNames.get(position1),Toast.LENGTH_SHORT).show();

    }



    @Override
    public int getItemCount() {
        return imageNames.size();
    }





}
