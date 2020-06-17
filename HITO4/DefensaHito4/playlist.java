package com.example.hito4ronaldlluscoreciclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.hito4ronaldlluscoreciclerview.Adapter.RVAdapter;
import com.example.hito4ronaldlluscoreciclerview.Adapter.RVAdapter1;

import java.util.ArrayList;
import java.util.Arrays;

public class playlist extends AppCompatActivity {
    public static final String TAG ="playlist";
    //nuevo
    public RVAdapter1 adapter;
    public RecyclerView recyclerView;
    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<String> imageurl = new ArrayList<>();
    private ArrayList<String> imagepause = new ArrayList<>();
    private ArrayList<String> imagestop = new ArrayList<>();
    //para todas las imagenes

    private final  String imgurl ="59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq";
    private final  String imgpause ="2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ";
    private final  String imgstop ="LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe";
    private final  String imgname ="Playlist 1,Playlist 2,Playlist 3,Playlist 4,Playlist 5,Playlist 6,Playlist 7,Playlist 8,Playlist 9,Playlist 10,Playlist 11,Playlist 12";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
        _initImageBitmaps();
        _initRecyclerView();
    }
    private void _initImageBitmaps()
    {
        Log.d(TAG,"initImageBitmaps: preparing bitmaps.");

        imageurl.addAll(Arrays.asList(imgurl.split(",")));
        imagepause.addAll(Arrays.asList(imgpause.split(",")));
        imagestop.addAll(Arrays.asList(imgstop.split(",")));
        names.addAll(Arrays.asList(imgname.split(",")));

    }
    private void _initRecyclerView()
    {
        Log.d(TAG,"initRecyclerView: init recyclerview.");
        recyclerView = findViewById(R.id.rvContainer1);
        adapter = new RVAdapter1(this,names,imageurl,imagepause,imagestop);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


}
