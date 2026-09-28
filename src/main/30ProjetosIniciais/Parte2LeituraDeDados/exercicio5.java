package Parte2LeituraDeDados;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digita uma palavra e eu te informo a letra inicial: ");
        String palavra = scanner.nextLine();


        char inicial = palavra.charAt(0);

        System.out.println("A primeira palavra é: " + inicial);

        scanner.close();

    }
}
