package com.example.calculadoraandroid.calculadoraJava;

public class Calculos {

    public float getResultado(float val1, float val2, char operador){
        float resultado;
        switch (operador){
            case '+':
                resultado = val1 + val2;
                break;
            case '-':
                resultado = val1 - val2;
                break;
            case '*':
                resultado = val1 * val2;
                break;
            case '/':
                resultado = val1 / val2;
                break;
            default:
                resultado = 0;

        }
        return resultado;
    }


}
