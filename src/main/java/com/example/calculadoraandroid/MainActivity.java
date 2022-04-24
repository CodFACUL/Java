package com.example.calculadoraandroid;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.calculadoraandroid.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9,
            button0,buttonIgual,buttonCe,buttonDivide,buttonMult,buttonSoma,buttonSubtrai;
    private Float val1;
    private Float val2;
    private Character lastOperator;
    private Character operador;
    private TextView visor;
    private boolean isFirst = true;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        criaComponentes();
        setOnClickListnerButtons();

    }

    protected void setOnClickListnerButtons(){
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button0.setOnClickListener(this);
        buttonIgual.setOnClickListener(this);
        buttonCe.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonMult.setOnClickListener(this);
        buttonSoma.setOnClickListener(this);
        buttonSubtrai.setOnClickListener(this);
    }

    protected void criaComponentes(){
        button1 = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        button0 = (Button)findViewById(R.id.button0);
        buttonIgual = (Button)findViewById(R.id.buttonIgual);
        buttonCe = (Button)findViewById(R.id.buttonCe);
        buttonDivide = (Button)findViewById(R.id.buttonDivide);
        buttonMult = (Button)findViewById(R.id.buttonMult);
        buttonSoma = (Button)findViewById(R.id.buttonSoma);
        buttonSubtrai = (Button)findViewById(R.id.buttonSubtrai);
        visor = (TextView) findViewById(R.id.visor);
    }

    protected void resetAll(){
        val1 = null;
        val2 = null;
        operador = null;
        visor.setText("");
        lastOperator = null;
        isFirst = true;
    }

    protected void executeSum(){
        if(val2 != null){
            val1 = val1 + val2;
            val2 = null;
            visor.setText(""+val1);
        }else {
            val2 = val1;
        }
    }

    protected void executeSub(){
        System.out.println(val1+" "+val2+" "+lastOperator+" "+operador);
        if(val2 != null){
            val1 = val1 - val2;
            val2 = null;
            visor.setText(""+val1);
        }else {
            val2 = val1;
        }
    }

    protected void executeMult(){
        if(val2 != null){
            val1 = val1 * val2;
            val2 = null;
            visor.setText(""+val1);
        }else {
            val2 = val1;
        }
    }

    protected void executeDiv(){
        if(val2 != null){
            val1 = val1 / val2;
            val2 = null;
            visor.setText(""+val1);
        }else {
            val2 = val1;
        }
    }

    protected void trataClick(){
        if(operador == '='){
            operador = null;
        }
        if(lastOperator != null){
            isFirst = false;
            System.out.println(val1+" "+val2+" "+lastOperator+" "+operador);
            switch (lastOperator){
                case '+':
                    executeSum();
                    break;
                case '-':
                    executeSub();
                    break;
                case '*':
                    executeMult();
                    break;
                case '/':
                    executeDiv();
                    break;
            }
        }else{
            visor.setText("");
        }
        lastOperator = operador;

    }


    protected void concat(int valor){
        if(!isFirst){
            visor.setText("");
            isFirst = false;
        }
        visor.append(String.valueOf(valor));
        if(lastOperator == null){
            val1 = Float.parseFloat(visor.getText().toString());
        }else{
            val2 = Float.parseFloat(visor.getText().toString());
        }
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button0:
                concat(0 );
                break;
            case R.id.button:
                concat(1 );
                break;
            case R.id.button2:
                concat(2 );
                break;
            case R.id.button3:
                concat(3 );
                break;
            case R.id.button4:
                concat(4 );
                break;
            case R.id.button5:
                concat(5 );
                break;
            case R.id.button6:
                concat(6 );
                break;
            case R.id.button7:
                concat(7 );
                break;
            case R.id.button8:
                concat(8 );
                break;
            case R.id.button9:
                concat(9 );
                break;
            case R.id.buttonSoma:
                operador = '+';
                trataClick();
                break;
            case R.id.buttonSubtrai:
                operador = '-';
                trataClick();
                break;
            case R.id.buttonMult:
                operador = '*';
                trataClick();
                break;
            case R.id.buttonDivide:
                operador = '/';
                trataClick();
                break;
            case R.id.buttonCe:
                resetAll();
                break;
            case R.id.buttonIgual:
                operador = '=';
                trataClick();
                break;
        }
    }
}