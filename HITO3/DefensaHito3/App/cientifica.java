package com.example.hito3onboarningcalcu.App;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.hito3onboarningcalcu.R;

public class cientifica extends AppCompatActivity {
    private TextView tv,tv2,tvs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cientifica);
        initilizeComponent();
    }


    private void initilizeComponent()
    {
        tv = findViewById(R.id.ed);
        tv2 = findViewById(R.id.ed2);
        tvs = findViewById(R.id.edse);
        String username =getIntent().getStringExtra("USE");
        String tipe = getIntent().getStringExtra("SEL");
        String msg1 = "App: "+tipe;
        String msg ="bienvenido: "+ username;
        tv.setText(msg);
        tvs.setText(msg1);
        tv2.setText("Calculadora en Ejecucion");
    }
}
