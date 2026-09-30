package exercicios;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();


        String maiusculo = nome.toLowerCase();
        String minusculo = nome.toUpperCase();

        System.out.println("Em minúsulo: " + minusculo);
        System.out.println("Em maiúsculo: " + maiusculo);


        scanner.close();
    }
}
