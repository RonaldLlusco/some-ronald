package com.example.listadoreciclerview.Adapter;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listadoreciclerview.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ViewHolder extends RecyclerView.ViewHolder {


    private RelativeLayout trContainer;
    private CircleImageView circleImage;
    private TextView tvImage;
    public ViewHolder(View itemView) {
        super(itemView);
        initiComponentes(itemView);
    }

    private void initiComponentes(View itemView)
    {
        trContainer = itemView.findViewById(R.id.rlListItem);
        circleImage = itemView.findViewById(R.id.civItem);
        tvImage = itemView.findViewById(R.id.tvImage);

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
