package com.example.hito3onboarningcalcu.App;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hito3onboarningcalcu.R;

public class custom extends AppCompatActivity implements View.OnClickListener{
    private TextView tv,tv2,tvs;
    //declarar variables
    public Button btnuno,btndos,btncinco,btncero,btncam1,btncam2,btncam3,btnshif;
    public Button btnsuma,btnresta,btnmulti,btndiv,btnigual;
    public Button btncuatro,btncam4,btnclean,btnclose;
    public EditText pant;
    public double op1 = 0.0,opt;
    public double op2;
    public double res;
    int ope; //identificador para las operaciones
    int i=0;
    int c=0;
    Double op3 = 1.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
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

        pant=findViewById(R.id.caja);

        btncero=findViewById(R.id.btn0);
        btnuno=findViewById(R.id.btn1);
        btndos= findViewById(R.id.btn2);
        btncinco=findViewById(R.id.btn3);
        btnsuma = findViewById(R.id.btnmas);
        btnresta = findViewById(R.id.btnmenos);
        btnmulti = findViewById(R.id.btnmulti);
        btndiv = findViewById(R.id.btndiv);
        btnigual = findViewById(R.id.btnigual);
        btncam1 = findViewById(R.id.btncam1);
        btncam2 = findViewById(R.id.btncam2);
        btncam3 = findViewById(R.id.btncam3);
        btnshif = findViewById(R.id.btnshif);
        btncam4 = findViewById(R.id.btncam4);
        btncuatro = findViewById(R.id.btn4);
        btnclean = findViewById(R.id.btnclean);
        btnclose = findViewById(R.id.btncerrar);

        btnigual.setOnClickListener(this);
        btncero.setOnClickListener(this);
        btnuno.setOnClickListener(this);
        btndos.setOnClickListener(this);
        btncinco.setOnClickListener(this);
        btnsuma.setOnClickListener(this);
        btnresta.setOnClickListener(this);
        btnmulti.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btncam1.setOnClickListener(this);
        btncam2.setOnClickListener(this);
        btncam3.setOnClickListener(this);
        btnshif.setOnClickListener(this);
        btncam4.setOnClickListener(this);
        btncuatro.setOnClickListener(this);
        btnclean.setOnClickListener(this);
        btnclose.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn0:
                String capc = pant.getText().toString();
                capc = capc + "0";
                pant.setText(capc);
                break;
            case R.id.btn1:
                String cap = pant.getText().toString();
                cap = cap + "1";
                pant.setText(cap);
                break;
            case R.id.btn2:
                String cap1 = pant.getText().toString();
                cap1 = cap1 + "2";
                pant.setText(cap1);
                break;
            case R.id.btn3:
                String cap3 = pant.getText().toString();
                cap3 = cap3 + "3";
                pant.setText(cap3);
                break;
            case R.id.btn4:
                String cap4 = pant.getText().toString();
                cap4 = cap4 + "4";
                pant.setText(cap4);
                break;
            case R.id.btnclean:
                pant.setText("");
                break;
            case R.id.btnmas:
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
            case R.id.btncam1:
                elvadodos();
                break;
            case R.id.btncam2:
                elvadotres();
                break;
            case R.id.btncam3:
                factorial();
                break;
            case R.id.btncam4:
                sumn();
                break;

            case R.id.btncerrar:
                finish();
                break;
            case R.id.btnshif: {
                i++;
                if (i % 2 == 0) {
                    btncam1.setText("x^2");
                    btncam2.setText("x^3");
                    btncam3.setText("N!");
                    btncam4.setText("Σn");
                    btncam1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            elvadodos();
                        }
                    });
                    btncam2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            elvadotres();
                        }
                    });
                    btncam3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            factorial();
                        }
                    });
                    btncam4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            sumn();
                        }
                    });

                } else {
                    btncam1.setText("x^3");
                    btncam2.setText("x^y");
                    btncam3.setText("Σfibo");
                    btncam4.setText("Σnxy");
                    btncam1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            elvadotres();
                        }
                    });
                    btncam2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                           elevxy();
                        }
                    });
                    btncam3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                           fibo();
                        }
                    });
                    btncam4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            sumnxy();
                        }
                    });

                }

            }
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
                Toast.makeText(getApplicationContext(),"Ingrese datos validos",Toast.LENGTH_LONG).show();
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
            else if(ope==5)
            {
              res = Math.pow(op1,op2);
            }
            else if(ope==6)
            {

                for(Double i = op1;i<=op2;i++)
                {
                    res = res+i;
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
                Toast.makeText(getApplicationContext(),"Ingrese datos validos",Toast.LENGTH_LONG).show();
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
                Toast.makeText(getApplicationContext(),"Ingrese datos validos",Toast.LENGTH_LONG).show();
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


            }
            catch (NumberFormatException e){
                Toast.makeText(getApplicationContext(),"Ingrese datos validos",Toast.LENGTH_LONG).show();
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
                Toast.makeText(getApplicationContext(),"Ingrese datos validos",Toast.LENGTH_LONG).show();
            }
            pant.setText("");
            ope = 4;
            c++;
        }


        public void factorial()
        {
            try {
                double fact=1;
                String auxi = pant.getText().toString();
                Double op11 = Double.parseDouble(auxi);
                for(Double i = op11;i>0;i--)
                {
                    fact = fact*i;
                }
                pant.setText(""+fact);
            }
            catch (Exception a)
            {
                Toast.makeText(getApplicationContext(),"Ingrese datos validos",Toast.LENGTH_LONG).show();
            }

        }


        public void elvadodos()
        {

            try {
                String auxi = pant.getText().toString();
                double op11 = Double.parseDouble(auxi);
                double res = Math.pow(op11,2);
                pant.setText(""+res);
            }
            catch (Exception a)
            {
                Toast.makeText(getApplicationContext(),"Ingrese datos validos",Toast.LENGTH_LONG).show();
            }

        }
    public void elvadotres()
    {

        try {
            String auxi = pant.getText().toString();
            double op11 = Double.parseDouble(auxi);
            double res = Math.pow(op11,3);
            pant.setText(""+res);
        }
        catch (Exception a)
        {
            Toast.makeText(getApplicationContext(),"Ingrese datos validos",Toast.LENGTH_LONG).show();
        }

    }

        public void sumn()
        {
            try {
                double fact=0;
                String auxi = pant.getText().toString();
                Double op11 = Double.parseDouble(auxi);
                for(Double i = op11;i>0;i--)
                {
                    fact = fact+i;
                }
                pant.setText(""+fact);
            }
            catch (Exception a)
            {
                Toast.makeText(getApplicationContext(),"Ingrese datos validos",Toast.LENGTH_LONG).show();
            }


        }
        public void elevxy()
        {
            try {


                String auxi = pant.getText().toString();
                op1 = Double.parseDouble(auxi);


            }
            catch (NumberFormatException e){
                Toast.makeText(getApplicationContext(),"Ingrese datos validos",Toast.LENGTH_LONG).show();
            }
            pant.setText("");
            ope = 5;
        }
        public void fibo()
        {

            try {
                String auxi = pant.getText().toString();
                op1 = Double.parseDouble(auxi);
                  int f =0;
                  int t1 =1;
                  int t2;
                  int sum =0;
                  for(double i = 1;i<=op1;i++)
                  {
                      t2 = f;
                      f = t1 +f;
                      t1 = t2;
                    sum = sum + t1;
                  }
                  pant.setText(""+sum);
         op1=0;
            }
            catch (Exception E)
            {

            }


        }
        public void sumnxy()
        {
            try {

                String auxi = pant.getText().toString();
                op1 = Double.parseDouble(auxi);
                pant.setText("");
                ope=6;
            }
            catch (Exception a)
            {
                Toast.makeText(getApplicationContext(),"Ingrese datos validos",Toast.LENGTH_LONG).show();
            }

        }
}
