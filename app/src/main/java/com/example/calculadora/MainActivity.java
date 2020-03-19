package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public EditText Display;
    public double operacion1, operacion2, resultado;
    int operacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Display=(EditText)findViewById(R.id.Display);
    }

    public void Bt0(View view){

        String cap= Display.getText().toString();
        cap = cap+"0";
        Display.setText(cap);
    }

    public void Bt1(View view){

        String cap= Display.getText().toString();
        cap = cap+"1";
        Display.setText(cap);
    }

    public void Bt2(View view){

        String cap= Display.getText().toString();
        cap = cap+"2";
        Display.setText(cap);
    }

    public void Bt3(View view){

        String cap= Display.getText().toString();
        cap = cap+"3";
        Display.setText(cap);
    }

    public void Bt4(View view){

        String cap= Display.getText().toString();
        cap = cap+"4";
        Display.setText(cap);
    }

    public void Bt5(View view){

        String cap= Display.getText().toString();
        cap = cap+"5";
        Display.setText(cap);
    }

    public void Bt6(View view){

        String cap= Display.getText().toString();
        cap = cap+"6";
        Display.setText(cap);
    }

    public void Bt7(View view){

        String cap= Display.getText().toString();
        cap = cap+"7";
        Display.setText(cap);
    }

    public void Bt8(View view){

        String cap= Display.getText().toString();
        cap = cap+"8";
        Display.setText(cap);
    }

    public void Bt9(View view){

        String cap= Display.getText().toString();
        cap = cap+"9";
        Display.setText(cap);
    }

    public void BtPun(View view){

        String cap= Display.getText().toString();
        cap = cap+".";
        Display.setText(cap);
    }

    public void suma(View view){

        try {
            String aux1 = Display.getText().toString();
            operacion1 = Double.parseDouble(aux1);
            Display.setText("");
            operacion = 1;
        }catch (NumberFormatException nfe){

        }
    }

    public void resta(View view){

        try {
            String aux1 = Display.getText().toString();
            operacion1 = Double.parseDouble(aux1);
            Display.setText("");
            operacion = 2;

        }catch (NumberFormatException nfe){

        }
    }

    public void multiplicacion(View view){

        try {
            String aux1 = Display.getText().toString();
            operacion1 = Double.parseDouble(aux1);
            Display.setText("");
            operacion = 3;

        }catch (NumberFormatException nfe){

        }
    }

    public void divicion(View view){

        try {
            String aux1 = Display.getText().toString();
            operacion1 = Double.parseDouble(aux1);
            Display.setText("");
            operacion = 4;

        }catch (NumberFormatException nfe){

        }
    }

    public void  igual(View view) {
        try {
            String aux1 = Display.getText().toString();
            operacion2 = Double.parseDouble(aux1);

            Display.setText("");

            if (operacion == 1) {
                resultado = operacion1 + operacion2;
            } else if (operacion == 2) {
                resultado = operacion1 - operacion2;
            } else if (operacion == 3) {
                resultado = operacion1 * operacion2;
            } else if (operacion == 4) {
                if (operacion1==0){Display.setText("no se puede dividir entre 0");}
                else {resultado = operacion1 / operacion2;}
            }

        Display.setText(""+resultado);
        operacion1=resultado;

        } catch (NumberFormatException nfe) {

        }
    }

    public void clear(View view){
        Display.setText("");
        operacion1=0;
        operacion2=0;
        operacion=0;
        resultado=0;
    }

    public void borrar(View view){

        if(!Display.getText().toString().equals("")){
            Display.setText(Display.getText().subSequence(0, Display.getText().length()-1)+"");
        }
    }


}
