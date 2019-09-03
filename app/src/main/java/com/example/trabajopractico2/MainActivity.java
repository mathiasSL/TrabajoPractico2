package com.example.trabajopractico2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.conversor_view);




    }

    public void activar(View view) {

        RadioButton opcion1 = findViewById(R.id.rbDolar);
        RadioButton opcion2 = findViewById(R.id.rbEuro);
        EditText textdolar = findViewById(R.id.etDolares);
        EditText texteuro = findViewById(R.id.etEuros);
        EditText textresp = findViewById(R.id.etResultado);

        if (opcion1.isChecked()==true) {
            textdolar.setEnabled(true);
            texteuro.setEnabled(false);
            texteuro.setText("");
        } else if (opcion2.isChecked()==true) {
            texteuro.setEnabled(true);
            textdolar.setEnabled(false);
            textdolar.setText("");
        }
    }

    public void cambiar(View v) {

        RadioButton opcion1 = findViewById(R.id.rbDolar);
        RadioButton opcion2 = findViewById(R.id.rbEuro);
        EditText textdolar = findViewById(R.id.etDolares);
        EditText texteuro = findViewById(R.id.etEuros);
        EditText textresp = findViewById(R.id.etResultado);

        double valordolar = 1.10;
        double valoreuro = 0.90;

        if(opcion1.isChecked()==true)
        {
            if (Double.parseDouble(textdolar.getText().toString()) > 0) {
                double res = Double.parseDouble(textdolar.getText().toString()) / valordolar;
                textresp.setText(String.valueOf(res));
            } else {
                Toast.makeText(this, "Ingrese numero mayor que cero", Toast.LENGTH_LONG).show();
            }

        }
        else if(opcion2.isChecked()==true)
        {
            if (Double.parseDouble(texteuro.getText().toString()) > 0) {
                double res = Double.parseDouble(texteuro.getText().toString()) / valoreuro;
                textresp.setText(String.valueOf(res));
            } else {
                Toast.makeText(this, "Ingrese numero mayor que cero", Toast.LENGTH_LONG).show();
            }
        }

    }
}
