package Parte3OperacaoMatematica;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Para calcular um quadradado me diga o lado dele");
        String texto = scanner.nextLine();
        double lado = Double.parseDouble(texto);


        double soma = lado * lado;


        System.out.println("o tamanho de ambos é: "+ soma);


        scanner.close();
    }
}
