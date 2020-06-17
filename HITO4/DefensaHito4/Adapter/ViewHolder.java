package com.example.hito4ronaldlluscoreciclerview.Adapter;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.hito4ronaldlluscoreciclerview.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private RelativeLayout trContainer;
    private CircleImageView circleImage;
    private TextView tvImage;
    //contex activity
    private Context context;
    //buton
    private Button escuchar;
    private Button neww;

    public ViewHolder(View itemView) {
        super(itemView);
        initiComponentes(itemView);
    }


    public Button getNeww() {
        return neww;
    }

    private void initiComponentes(View itemView)
    {
        trContainer = itemView.findViewById(R.id.rlListItem);
        circleImage = itemView.findViewById(R.id.civItem);
        tvImage = itemView.findViewById(R.id.tvImage);
        escuchar = itemView.findViewById(R.id.escuchar);
        neww = itemView.findViewById(R.id.auto);
        context=itemView.getContext();

    }
    public Context getContext() {
        return context;
    }

    public Button getEscuchar() {
        return escuchar;
    }
    public RelativeLayout getTrContainer() {
        return trContainer;
    }

    public CircleImageView getCircleImage() {
        return circleImage;
    }

    public TextView getTvImage() {
        return tvImage;
    }

}
