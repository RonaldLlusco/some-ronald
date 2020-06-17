package com.example.hito4ronaldlluscoreciclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.hito4ronaldlluscoreciclerview.Adapter.RVAdapter;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    public static final String TAG ="MainActivity";
    //nuevo
    public RVAdapter adapter;
    public RecyclerView recyclerView;
    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<String> imageurl = new ArrayList<>();
    //para todas las imagenes
    private final  String imgurl ="V4OgA4O,yB3d2qH,9jMbaX2,rYndmdq,sypYnSP,HBeK1ot,YCqbt8r,eLk31XX,4ZHp7FO,XzffKgy,DJabk5C";
    private final  String imgname ="Playlist 1,Playlist 2,Playlist 3,Playlist 4,Playlist 5,Playlist 6,Playlist 7,Playlist 8,Playlist 9,Playlist 10,Playlist 11";
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

        imageurl.addAll(Arrays.asList(imgurl.split(",")));
        names.addAll(Arrays.asList(imgname.split(",")));

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
