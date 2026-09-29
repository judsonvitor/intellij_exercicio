package Parte3OperacaoMatematica;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Convertendo metros para centímetros, Diga os metros.");
        String texto = scanner.nextLine();
        double metros = Double.parseDouble(texto);


        double centimetros = metros * 100;


        System.out.println("A conversão para centímetros ficou: " + centimetros);

        scanner.close();
    }
}
