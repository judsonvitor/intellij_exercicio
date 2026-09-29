package Parte3OperacaoMatematica;

import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Conversão de minutos. ");
        String texto = scanner.nextLine();
        int totalDeMinutos = Integer.parseInt(texto);

        int horas = totalDeMinutos / 60;
        int minutosRestantes = totalDeMinutos % 60;


        System.out.println("Quantas horas completas: " + horas);
        System.out.println("E quantos minutos restantes: " + minutosRestantes);








        scanner.close();
    }
}
