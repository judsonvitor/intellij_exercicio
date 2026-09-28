package Parte2LeituraDeDados;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();


        System.out.println("O seu nome é: " + nome);




        scanner.close();
    }
}
