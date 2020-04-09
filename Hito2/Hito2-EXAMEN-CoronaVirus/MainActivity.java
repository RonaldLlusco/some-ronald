package com.example.hito2coronavirus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnset,btncalcu;
    private EditText t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    private String s1,s2,s3,s4;
    private String c1,c2,c3,c4,c5,c6;
    private int res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializavariables();
    }

    public void initializavariables()
    {


        //texbox
        t1=findViewById(R.id.txt1);
        t2=findViewById(R.id.txt2);
        t3=findViewById(R.id.txt3);
        t4=findViewById(R.id.txt4);
        t5=findViewById(R.id.txt5);
        t6=findViewById(R.id.txt6);


        //abajo
        t7=findViewById(R.id.txt7);
        t8=findViewById(R.id.txt8);
        t9=findViewById(R.id.txt9);
        btnset=findViewById(R.id.btnset);
        btnset.setOnClickListener(this);

        // txt de confi
        t10=findViewById(R.id.txt10);

        //Botones
        btncalcu=findViewById(R.id.btncalcu);
        btncalcu.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnset:
               set();
                break;
            case R.id.btncalcu:
              calcular();


                break;

        }
    }




    public void set()
    {
        try {
            s1 = t7.getText().toString();
            s2 = t8.getText().toString();
            s3 = t9.getText().toString();

            if(s1.equals(""))
            {
                Toast.makeText(getApplication(),"INGRESE VALORES",Toast.LENGTH_LONG).show();
            }
            else if(s2.equals(""))
            {
                Toast.makeText(getApplication(),"INGRESE VALORES",Toast.LENGTH_LONG).show();
            }
            else if(s1.equals("") && s2.equals(""))
            {
                Toast.makeText(getApplication(),"INGRESE VALORES",Toast.LENGTH_LONG).show();
            }
            else
            {
                if(s3.equals("cochabamba"))
                {
                    t1.setText(s1);
                    t2.setText(s2);
                }
                else if(s3.equals("Cochabamba"))
                {
                    t1.setText(s1);
                    t2.setText(s2);
                }
                else if(s3.equals("COCHABAMBA"))
                {
                    t1.setText(s1);
                    t2.setText(s2);
                }
                else if(s3.equals("santa cruz"))
                {
                    t3.setText(s1);
                    t4.setText(s2);
                }
                else if(s3.equals("Santa cruz"))
                {
                    t3.setText(s1);
                    t4.setText(s2);
                }
                else if(s3.equals("SANTA CRUZ"))
                {
                    t3.setText(s1);
                    t4.setText(s2);
                }
                else if(s3.equals("oruro"))
                {
                    t5.setText(s1);
                    t6.setText(s2);
                }
                else if(s3.equals("Oruro"))
                {
                    t5.setText(s1);
                    t6.setText(s2);
                }
                else if(s3.equals("ORURO"))
                {
                    t5.setText(s1);
                    t6.setText(s2);
                }
                else
                {
                    Toast.makeText(getApplication(),"INGRESE VALOR",Toast.LENGTH_LONG).show();
                }
            }

        }
        catch (NumberFormatException e)
        {
            Toast.makeText(getApplication(),"INGRESE VALOR",Toast.LENGTH_LONG).show();
        }

    }

public void calcular()
{

    try {

        c1=t1.getText().toString();
        c2=t2.getText().toString();
        c3=t3.getText().toString();
        c4=t4.getText().toString();
        c5=t5.getText().toString();
        c6=t6.getText().toString();


        s4 = t10.getText().toString();
        if(s4.equals("confirmados"))
        {
            if( Integer.parseInt( c1)>Integer.parseInt( c3) && Integer.parseInt( c1)>Integer.parseInt( c5))
            {
                Toast.makeText(getApplication(),"COCHABAMBA CON "+ c1,Toast.LENGTH_LONG).show();
            }
            else if( Integer.parseInt( c3)>Integer.parseInt( c1) && Integer.parseInt( c3)>Integer.parseInt( c5))
            {
                Toast.makeText(getApplication(),"SANTA CRUZ CON "+ c3,Toast.LENGTH_LONG).show();
            }

            else if( Integer.parseInt( c5)>Integer.parseInt( c1) && Integer.parseInt( c5)>Integer.parseInt( c3))
            {
                Toast.makeText(getApplication(),"ORURO CON "+ c5,Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(getApplication(),"VALORES IGUALES",Toast.LENGTH_LONG).show();
            }




        }
        else if(s4.equals("sospechosos"))
        {
            if( Integer.parseInt( c2)>Integer.parseInt( c4) && Integer.parseInt( c2)>Integer.parseInt( c6))
            {
                Toast.makeText(getApplication(),"COCHABAMBA CON "+ c2,Toast.LENGTH_LONG).show();
            }
            else if( Integer.parseInt( c4)>Integer.parseInt( c2) && Integer.parseInt( c4)>Integer.parseInt( c6))
            {
                Toast.makeText(getApplication(),"SANTA CRUZ CON "+ c4,Toast.LENGTH_LONG).show();
            }

            else if( Integer.parseInt( c6)>Integer.parseInt( c2) && Integer.parseInt( c6)>Integer.parseInt( c4))
            {
                Toast.makeText(getApplication(),"ORURO CON "+ c6,Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(getApplication(),"VALORES IGUALES",Toast.LENGTH_LONG).show();
            }



        }
        else {
            Toast.makeText(getApplication(),"INGRESE VALOR",Toast.LENGTH_LONG).show();
        }

    }
    catch (NumberFormatException e)
    {
        Toast.makeText(getApplication(),"INGRESE VALOR",Toast.LENGTH_LONG).show();
    }


}















}
