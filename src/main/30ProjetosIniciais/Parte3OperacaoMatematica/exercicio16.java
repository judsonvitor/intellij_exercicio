package Parte3OperacaoMatematica;

import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Conversão de horas para minutos. ");
        String texto = scanner.nextLine();
        double horas = Double.parseDouble(texto);



        double minutos = horas * 60;

        System.out.println("A conversão ficou: " + minutos);

        scanner.close();
    }
}
