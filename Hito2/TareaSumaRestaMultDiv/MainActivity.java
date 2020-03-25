package com.example.app2secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText et1 , text2;
    private TextView tv1 , tvres;
    private Button btnsumar;
    private  Button btnrestar, btnmulti,btndivi;
    public String v1,v2;
    public int r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializavariables();
    }
    public void  initializavariables()
    {
        et1 = findViewById(R.id.etn1);
        tv1 = findViewById(R.id.tv1);
        text2 = findViewById(R.id.etn2);
        tvres=findViewById(R.id.res);
        tv1.setText("Univ: Ronald J llusco");

        btnsumar = findViewById(R.id.btres);
        btnrestar = findViewById(R.id.btrestar);
        btnmulti = findViewById(R.id.btmulti);
        btndivi = findViewById(R.id.btdividir);
        //obtener evento click del boton
        btnsumar.setOnClickListener(this);
        btnrestar.setOnClickListener(this);
        btnmulti.setOnClickListener(this);
        btndivi.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btres:

                v1 = et1.getText().toString();
                v2 = text2.getText().toString();
                r = Integer.parseInt(v1) + Integer.parseInt(v2);
                tvres.setText(" "+ r);

                break;//logica
            case R.id.btrestar:
                 v1 = et1.getText().toString();
                 v2 = text2.getText().toString();

            r = Integer.parseInt(v2) - Integer.parseInt(v1);
            tvres.setText(" "+ r);
            break;
            case R.id.btmulti:
                v1 = et1.getText().toString();
                v2 = text2.getText().toString();

                r = Integer.parseInt(v1) * Integer.parseInt(v2);
                tvres.setText(" "+ r);
                break;
            case R.id.btdividir:
                v1 = et1.getText().toString();
                v2 = text2.getText().toString();

                r = Integer.parseInt(v2) / Integer.parseInt(v1);
                tvres.setText(" "+ r);
                break;
        }
    }
}
