package com.example.hito3onboarningcalcu.Onboarding;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hito3onboarningcalcu.App.basica;
import com.example.hito3onboarningcalcu.App.cientifica;
import com.example.hito3onboarningcalcu.App.custom;
import com.example.hito3onboarningcalcu.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class pantallatres extends Fragment {

    private TextView textNextAwards, textPrevAwards;
    private ViewPager viewPager;
    private EditText edsele,eduser;
    private View view;
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btnregister;
    private EditText ed1,ed2;
    public pantallatres() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        _initializeInflater(inflater, container);

        //initialize components
        _initialize();

        //add click event to text Next and prev text
       metclick();

        //return
        return view;

    }
    public void _initializeInflater(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_pantallatres, container, false);
    }

    public void _initialize() {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        //textNextAwards = view.findViewById(R.id.textNextTextRecognition);
        btn1= view.findViewById(R.id.btn1);
        btn2=view.findViewById(R.id.btn2);
        btn3=view.findViewById(R.id.btn3);
        btn4=view.findViewById(R.id.btn4);
        btn5=view.findViewById(R.id.btn5);
        btn6=view.findViewById(R.id.btn6);
        ed1=view.findViewById(R.id.ed1);
        ed2=view.findViewById(R.id.ed2);
        btnregister = view.findViewById(R.id.btningresar);
        edsele = view.findViewById(R.id.ed1);
        eduser = view.findViewById(R.id.ed2);

    }

    public  void metclick()
    {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Calculadora con operaciones simples basica", Toast.LENGTH_LONG).show();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Calculadora con operaciones avanzadas", Toast.LENGTH_LONG).show();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Calculadora con operaciones para programadores", Toast.LENGTH_LONG).show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("Basica");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("Cientifica");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("Custom");
            }
        });
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sel = edsele.getText().toString().trim();
                String use = eduser.getText().toString().trim();

                if(sel.equals("Custom"))
                {
                    if(validacion(sel,use))
                    {
                        Toast.makeText(getActivity(),"Por favor ingresa tipo calculadora/usuario",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Intent inte = new Intent(getActivity(), custom.class);
                        inte.putExtra("SEL",sel);
                        inte.putExtra("USE",use);
                        startActivity(inte);
                        getActivity().finish();
                    }
                }
                if(sel.equals("Basica"))
                {
                    if(validacion(sel,use))
                    {
                        Toast.makeText(getActivity(),"Por favor ingresa tipo calculadora/usuario",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Intent inte1 = new Intent(getActivity(), basica.class);
                        inte1.putExtra("SEL",sel);
                        inte1.putExtra("USE",use);
                        startActivity(inte1);
                        getActivity().finish();
                    }
                }
                if(sel.equals("Cientifica"))
                {
                    if(validacion(sel,use))
                    {
                        Toast.makeText(getActivity(),"Por favor ingresa tipo calculadora/usuario",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Intent inte2 = new Intent(getActivity(), cientifica.class);
                        inte2.putExtra("SEL",sel);
                        inte2.putExtra("USE",use);
                        startActivity(inte2);
                        getActivity().finish();
                    }
                }



            }
        });


    }
    public boolean validacion(String sel,String use)
    {
        boolean val = false;
        if(sel.equals("") || use.equals(""))
        {
            val=true;
        }
        return  val;
    }


}
