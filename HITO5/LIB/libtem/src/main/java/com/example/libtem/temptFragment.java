package com.example.libtem;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class temptFragment extends Fragment {

    private Button mcal;
    private EditText mtem;
    public temptFragment() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tempt, container, false);
        mcal = view.findViewById(R.id.btncalcular);
        mtem = view.findViewById(R.id.temperatura);
        mcal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double temperatura = Double.parseDouble(mtem.getText().toString());
                mtem.setText(Double.toString(temperatura*5));
            }
        });
        return view;
    }
}
