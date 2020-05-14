package com.example.hito3onboarningcalcu.Onboarding;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.hito3onboarningcalcu.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class pantallauno extends Fragment {

    private TextView textNext;
    private ViewPager viewPager;
    private View view;
    private Button btnfin;
    public pantallauno() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //initialize viewpager from main activity
        _initializeInflater(inflater, container);

        //initialize components
        _initialize();

        //add click event to text Next
        _addClickTextNext();
        _addClickBtnNext();
        // Inflate the layout for this fragment
        return view;
    }
    public void _initializeInflater(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_pantallauno, container, false);
    }
    public void _initialize() {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        textNext = view.findViewById(R.id.textNextWelcome);
        btnfin = view.findViewById(R.id.btnfin);


    }

    public void _addClickTextNext() {
        textNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });
    }
    public void _addClickBtnNext() {
        btnfin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);
            }
        });
    }



}
