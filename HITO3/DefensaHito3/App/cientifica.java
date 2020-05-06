package com.example.hito3onboarningcalcu.App;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.hito3onboarningcalcu.R;

public class cientifica extends AppCompatActivity implements View.OnClickListener {
    private TextView tv,tv2,tvs;
    //declarar variables
    public Button btnuno,btndos,btntres,btncuatro,btncinco,btnseis,btnsiete,btnocho,btnporcentaje,btnfrac,btnpunto,btnc2;
    public Button btnnueve,btncero,btnsuma,btnresta,btnmulti,btndiv,btnigual,btncuadrado,btnc,btnmasmenos,btnelimi,btnr;
    public EditText pant;
    public double op1 = 0.0,opt;
    public double op2;
    public double res;
    int ope; //identificador para las operaciones

    int c=0;
    Double op3 = 1.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cientifica);
        initilizeComponent();
    }


    private void initilizeComponent()
    {
        tv = findViewById(R.id.ed);

        tvs = findViewById(R.id.edse);
        String username =getIntent().getStringExtra("USE");
        String tipe = getIntent().getStringExtra("SEL");
        String msg1 = "App: "+tipe;
        String msg ="bienvenido: "+ username;
        tv.setText(msg);
        tvs.setText(msg1);
        //para almacenar lo que tenga el editex
        pant=findViewById(R.id.caja);
        btncero=findViewById(R.id.btn0);
        btnuno=findViewById(R.id.btn1);
        btndos= findViewById(R.id.btn2);
        btntres=findViewById(R.id.btn3);
        btncuatro= findViewById(R.id.btn4);
        btncinco=findViewById(R.id.btn5);
        btnseis= findViewById(R.id.btn6);
        btnsiete=findViewById(R.id.btn7);
        btnocho= findViewById(R.id.btn8);
        btnnueve=findViewById(R.id.btn9);
        btncuadrado=findViewById(R.id.btnelevarCuadrado);
        btnporcentaje = findViewById(R.id.btnporcentage);
        btnc = findViewById(R.id.btnC);
        btnsuma = findViewById(R.id.btnsuma);
        btnresta = findViewById(R.id.btnmenos);
        btnmulti = findViewById(R.id.btnmulti);
        btndiv = findViewById(R.id.btndiv);
        btnigual = findViewById(R.id.btnigual);
        btnmasmenos = findViewById(R.id.btnmasmenos);
        btnfrac = findViewById(R.id.btnfraccion);
        btnpunto = findViewById(R.id.btnpunto);
        btnelimi = findViewById(R.id.btnflecha);
        btnr=findViewById(R.id.btnR);
        btnc2 = findViewById(R.id.btnc2);

        btnigual.setOnClickListener(this);
        btncero.setOnClickListener(this);
        btnuno.setOnClickListener(this);
        btndos.setOnClickListener(this);
        btntres.setOnClickListener(this);
        btncuatro.setOnClickListener(this);
        btncinco.setOnClickListener(this);
        btnseis.setOnClickListener(this);
        btnsiete.setOnClickListener(this);
        btnocho.setOnClickListener(this);
        btnnueve.setOnClickListener(this);
        btnporcentaje.setOnClickListener(this);
        btnsuma.setOnClickListener(this);
        btnresta.setOnClickListener(this);
        btnmulti.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btncuadrado.setOnClickListener(this);
        btnc.setOnClickListener(this);
        btnmasmenos.setOnClickListener(this);
        btnfrac.setOnClickListener(this);
        btnpunto.setOnClickListener(this);
        btnelimi.setOnClickListener(this);
        btnr.setOnClickListener(this);
        btnc2.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn0:
                String capc = pant.getText().toString();
                capc=capc+"0";
                pant.setText(capc);
                break;
            case R.id.btn1:
                String cap = pant.getText().toString();
                cap=cap+"1";
                pant.setText(cap);
                break;
            case R.id.btn2:
                String cap1 = pant.getText().toString();
                cap1=cap1+"2";
                pant.setText(cap1);
                break;
            case R.id.btn3:
                String cap3 = pant.getText().toString();
                cap3=cap3+"3";
                pant.setText(cap3);
                break;
            case R.id.btn4:
                String cap4 = pant.getText().toString();
                cap4=cap4+"4";
                pant.setText(cap4);
                break;
            case R.id.btn5:
                String cap5 = pant.getText().toString();
                cap5=cap5+"5";
                pant.setText(cap5);
                break;
            case R.id.btn6:
                String cap6 = pant.getText().toString();
                cap6=cap6+"6";
                pant.setText(cap6);
                break;
            case R.id.btn7:
                String cap7 = pant.getText().toString();
                cap7=cap7+"7";
                pant.setText(cap7);
                break;
            case R.id.btn8:
                String cap8 = pant.getText().toString();
                cap8=cap8+"8";
                pant.setText(cap8);
                break;
            case R.id.btn9:
                String cap9 = pant.getText().toString();
                cap9=cap9+"9";
                pant.setText(cap9);
                break;

            case R.id.btnsuma:
                suma();
                break;
            case R.id.btnmenos:
                resta();
                break;
            case R.id.btnmulti:
                multi();
                break;
            case R.id.btndiv:
                div();
                break;
            case R.id.btnigual:
                todoslossignos();
                break;
            case R.id.btnelevarCuadrado:
                String a = pant.getText().toString();
                Double cua = Double.parseDouble(a);
                Double resp = Math.pow(cua,2);
                pant.setText(""+resp);
                break;
            case R.id.btnporcentage:
                String b = pant.getText().toString();
                Double por = Double.parseDouble(b);
                Double respe = por /100;
                pant.setText(""+respe);
                break;
            case  R.id.btnC:
                pant.setText("");
                break;
            case  R.id.btnmasmenos:
                String m = pant.getText().toString();
                Double mas = Double.parseDouble(m);
                Double respes = mas *-1;
                pant.setText(""+respes);
                break;
            case  R.id.btnfraccion:
                String m1 = pant.getText().toString();
                Double mas1 = Double.parseDouble(m1);
                Double respes1 = 1/mas1;
                pant.setText(""+respes1);
                break;
            case  R.id.btnpunto:
                String c = pant.getText().toString();
                if(c.length() <=0)
                {
                    pant.setText("0.");
                }
                else
                {
                    c=c+".";
                }
                pant.setText(c);
                break;
            case  R.id.btnflecha:
                String cc = pant.getText().toString();
                if(cc.length()>0)
                {
                    cc = cc.substring(0,cc.length()-1);
                    pant.setText(cc);
                }
                break;
            case  R.id.btnR:
                String cc1 = pant.getText().toString();
                if(cc1.length()>0) {
                    Double res = Math.sqrt(Double.parseDouble(cc1));
                    pant.setText(""+res);
                }
                break;
            case  R.id.btnc2:
                pant.setText("");
                break;
        }


    }

    public void todoslossignos()
    {
        try
        {
            String auxi2 = pant.getText().toString();
            op2 = Double.parseDouble(auxi2);
            //limpiar pantalla al preionar suma

        }
        catch (NumberFormatException e){
        }
        //limpiar pantalla al preionar suma

        pant.setText("");
        if(ope==1)
        {
            res = op1+op2;

        }
        else if(ope==2)
        {
            res=op1-op2;
        }
        else if(ope==3)
        {
            res=op1*op2;
        }
        else if(ope==4)
        {
            if(op2==0)
            {
                pant.setText("no puede dividir entre cero");
            }
            else
            {
                res=op1/op2;
            }
        }


        pant.setText(""+res);

        op1 =0.0;
        op3=1.0;
        c=0;
    }


    public void suma()
    {


        try {


            String auxi = pant.getText().toString();
            op1 = op1+Double.parseDouble(auxi);

            //numeros[c] = Double.parseDouble(aux);
            //limpiar pantalla al preionar suma

        }
        catch (NumberFormatException e){
        }
        pant.setText("");
        ope = 1;

    }
    public void resta()
    {


        try {
            op1=0;
            if(c<1)
            {
                String auxi = pant.getText().toString();
                op1 = (Double.parseDouble(auxi))-op1;
                op3=op1;
            }
            else if(c>0)
            {
                String auxi = pant.getText().toString();
                op1 = op3-(Double.parseDouble(auxi));
            }



            //limpiar pantalla al preionar suma

        }
        catch (NumberFormatException e){
        }
        pant.setText("");
        ope = 2;
        c++;
    }

    public void multi()
    {

        try {


            op1=1;
            String auxi = pant.getText().toString();
            op1 = op3*Double.parseDouble(auxi);
            op3 = op1;
            //numeros[c] = Double.parseDouble(aux);
            //limpiar pantalla al preionar suma

        }
        catch (NumberFormatException e){
        }
        pant.setText("");
        ope = 3;

    }

    public void div()
    {

        try {

            if(c<1)
            {
                String auxi = pant.getText().toString();
                op1 = Double.parseDouble(auxi)/op3;
                op3 = op1;
            }
            else if(c>0)
            {
                String auxi = pant.getText().toString();
                op1 = op3/Double.parseDouble(auxi);
                op3=op1;
            }
            //limpiar pantalla al preionar suma

        }
        catch (NumberFormatException e){
        }
        pant.setText("");
        ope = 4;
        c++;
    }







}
