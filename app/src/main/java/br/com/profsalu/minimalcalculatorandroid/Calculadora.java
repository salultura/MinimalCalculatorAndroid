package br.com.profsalu.minimalcalculatorandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        final EditText n1 = (EditText) findViewById(R.id.n1);
        final EditText n2 = (EditText) findViewById(R.id.n2);
        final TextView resultado = (TextView) findViewById(R.id.resultado);
        final Button somar = (Button) findViewById(R.id.btn_somar);
        final Button subtrair = (Button) findViewById(R.id.btn_subtrair);
        final Button multiplicar = (Button) findViewById(R.id.btn_multiplicar);
        final Button dividir = (Button) findViewById(R.id.btn_dividir);

        somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Calculadora", "somar");
                Double v1 = Double.parseDouble(n1.getText().toString());
                Double v2 = Double.parseDouble(n2.getText().toString());
                Double soma = v1 + v2;

                resultado.setText(soma.toString());
            }
        });

        subtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Calculadora", "subtrair");
                Double v1 = Double.parseDouble(n1.getText().toString());
                Double v2 = Double.parseDouble(n2.getText().toString());
                Double subtrair = v1 - v2;

                resultado.setText(subtrair.toString());
            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Calculadora", "multiplicar");
                Double v1 = Double.parseDouble(n1.getText().toString());
                Double v2 = Double.parseDouble(n2.getText().toString());
                Double multiplicar = v1 * v2;

                resultado.setText(multiplicar.toString());
            }
        });

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Calculadora", "dividir");
                Double v1 = Double.parseDouble(n1.getText().toString());
                Double v2 = Double.parseDouble(n2.getText().toString());
                Double dividir = v1 / v2;

                resultado.setText(dividir.toString());
            }
        });


    }
}
