package exercicios;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite uma pequena frase>>>>>");
        String frase = scanner.nextLine();


        int quantidade = frase.length();


        System.out.println("A quantidade de frase é: " + quantidade);


        scanner.close();
    }
}
