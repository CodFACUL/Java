package com.example.calculadoraandroid.calculadoraJava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.example.calculadoraandroid.R;

public class Actions extends AppCompatActivity {
    private Integer[] numeros = {0,1,2,3,4,5,6,7,8,9};
    private Character[] operadores = {'+','-','*','/','=','ce'};
    private Float val1;
    private Float val2;
    private String lastClick;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button)findViewById(R.id.button);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        Button button4 = (Button)findViewById(R.id.button4);
        Button button5 = (Button)findViewById(R.id.button5);
        Button button6 = (Button)findViewById(R.id.button6);
        Button button7 = (Button)findViewById(R.id.button7);
        Button button8 = (Button)findViewById(R.id.button8);
        Button button9 = (Button)findViewById(R.id.button9);
        Button button0 = (Button)findViewById(R.id.button0);
        Button buttonIgual = (Button)findViewById(R.id.buttonIgual);
        Button buttonCe = (Button)findViewById(R.id.buttonCe);
        Button buttonDivide = (Button)findViewById(R.id.buttonDivide);
        Button buttonMult = (Button)findViewById(R.id.buttonMult);
        Button buttonSoma = (Button)findViewById(R.id.buttonSoma);
        Button buttonSubtrai = (Button)findViewById(R.id.buttonSubtrai);
        TextView visor = (TextView) findViewById(R.id.visor);

        button0.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View view) {
                trataClick(0, null);
            }
        });

    }

    protected void trataClick(int valor, Character operador){

    }
}
