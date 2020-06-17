package com.example.hito4ronaldlluscoreciclerview.Adapter;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.hito4ronaldlluscoreciclerview.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ViewHolder1 extends RecyclerView.ViewHolder {
    private RelativeLayout trContainer1;
    private CircleImageView circleImage1;
    private CircleImageView circleImage2;
    private CircleImageView circleImage3;
    private TextView tvImage;

    public ViewHolder1(View itemView) {
        super(itemView);
        initiComponentes(itemView);
    }

    public RelativeLayout getTrContainer1() {
        return trContainer1;
    }

    public CircleImageView getCircleImage1() {
        return circleImage1;
    }

    public CircleImageView getCircleImage2() {
        return circleImage2;
    }

    public CircleImageView getCircleImage3() {
        return circleImage3;
    }

    public TextView getTvImage() {
        return tvImage;
    }

    private void initiComponentes(View itemView)
    {
        trContainer1 = itemView.findViewById(R.id.rlListItem1);
        circleImage1 = itemView.findViewById(R.id.civItemplay);
        circleImage2 = itemView.findViewById(R.id.civItempause);
        circleImage3 = itemView.findViewById(R.id.civItemstop);
        tvImage = itemView.findViewById(R.id.tvImage1);

    }

}
