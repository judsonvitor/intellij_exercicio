package treinandoRepeticoes;

import java.util.Scanner;

public class sequenciaFibonacci {
    public static void main(String[] args){

    int primeironumero = 0;
    int segundonumero = 1;
    int numeroterceiro;


    for (int i = 1; i<=17; i++){
        System.out.println(primeironumero + " ");
        numeroterceiro = primeironumero + segundonumero;
        primeironumero = segundonumero;
        segundonumero = numeroterceiro;
    }








    }
}
