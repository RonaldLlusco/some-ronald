package com.example.onboarningapp.Onboarding;

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

import com.example.onboarningapp.App.App;
import com.example.onboarningapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    private TextView textNextAwards, textPrevAwards;
    private ViewPager viewPager;
    private EditText eduser,edpass;
    private View view;
    private Button btnlogin,btnregister;
    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        _initializeInflater(inflater, container);

        //initialize components
        _initialize();

        //add click event to text Next and prev text
        _addClickNextAndPrev();

        //return
        return view;
    }

    public void _initializeInflater(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_login, container, false);
    }

    public void _initialize() {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        //textNextAwards = view.findViewById(R.id.textNextTextRecognition);
        textPrevAwards = view.findViewById(R.id.textPrevTextRecognition);
        btnlogin=view.findViewById(R.id.btnlogin);
        btnregister = view.findViewById(R.id.btnregiste);
        eduser = view.findViewById(R.id.ediuser);
        edpass = view.findViewById(R.id.edipass);
    }

    public void _addClickNextAndPrev() {
        /*textNextAwards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);
            }
        });*/

        textPrevAwards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String User = eduser.getText().toString().trim();
                String pass = edpass.getText().toString().trim();
                if(validacion(User,pass))
                {
                    Toast.makeText(getActivity(),"Por favor ingresa su user/password",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent inte = new Intent(getActivity(), App.class);
                    inte.putExtra("USERNAME",User);
                    inte.putExtra("USERPASS",pass);
                    startActivity(inte);
                    getActivity().finish();
                }

            }
        });
    }


    public boolean validacion(String User,String pass)
    {
        boolean val = false;
        if(User.equals("") || pass.equals(""))
        {
            val=true;
        }
        return  val;
    }

}
