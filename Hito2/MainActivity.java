package com.example.myprimerhola;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button but1;
    private TextView tex1;
    private EditText t1;
    private EditText t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeVariables();

    }

    public void initializeVariables()
    {
        //para agarrar el  buton y cambaria el nombre
        but1 = findViewById(R.id.button1);
        but1.setText("ingresar");
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //para agarrar los datos
                String contenido = t1.getText().toString();
                //mostrar
                String contenido2 = t2.getText().toString();

                int res = Integer.parseInt( contenido) + Integer.parseInt( contenido2);

                tex1.setText(" " + res);
            }
        });

        //para label texto y cambiar el nombre
        tex1 = findViewById(R.id.te1);
        tex1.setText("nombre estudiante: ronald llusco");

        //para caja de texbpox
        t1 = findViewById(R.id.et1);
        t2 = findViewById(R.id.et2);

    }


}
