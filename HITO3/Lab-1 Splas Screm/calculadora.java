package com.example.splashanimationparking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class calculadora extends AppCompatActivity {
    private ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        logo=findViewById (R.id.imgLogo);
       logo.animate().translationY(-600).setDuration(1200).setStartDelay(300);
    }
}
