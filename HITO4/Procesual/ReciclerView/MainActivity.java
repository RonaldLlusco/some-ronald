package com.example.listadoreciclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.listadoreciclerview.Adapter.RVAdapter;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    public static final String TAG ="MainActivity";
    //nuevo
    public  RVAdapter adapter;
    public  RecyclerView recyclerView;
    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<String> imageurl = new ArrayList<>();
    //para todas las imagenes
    private final  String imgurl ="VlGGqmG,DWX6eGn,EpmxiT3,V9Pcw5j,HkEJ5K4,DaXpXsG,0IRvKpq,XUZw40U,mjR9oaO";
    private final  String imgname ="WhatSaap,Twitter,YouTube,Snapchat,Instagram,Google+,Pinterest,LinkedIN,Facebook";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _initImageBitmaps();
        _initRecyclerView();
    }


    private void _initImageBitmaps()
    {
        Log.d(TAG,"initImageBitmaps: preparing bitmaps.");
       /* imageurl.add("VlGGqmG"); //R.drawable.sp para imagen desd  el drawa
        names.add("WhatSaap");*/
         //para rrercorre todos por for

        imageurl.addAll(Arrays.asList(imgurl.split(",")));
        names.addAll(Arrays.asList(imgname.split(",")));


        /*
        imageurl.add("DWX6eGn");names.add("Twitter");
        imageurl.add("EpmxiT3");names.add("YouTube");
        imageurl.add("V9Pcw5j"); names.add("Snapchat");
        imageurl.add("HkEJ5K4"); names.add("Instagram");
        imageurl.add("DaXpXsG"); names.add("Google+");
        imageurl.add("0IRvKpq"); names.add("Pinterest");
        imageurl.add("XUZw40U"); names.add("LinkedIN");
        imageurl.add("mjR9oaO"); names.add("Facebook");*/

    }
    private void _initRecyclerView()
    {
        Log.d(TAG,"initRecyclerView: init recyclerview.");
        recyclerView = findViewById(R.id.rvContainer);
        adapter = new RVAdapter(this,names,imageurl);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
