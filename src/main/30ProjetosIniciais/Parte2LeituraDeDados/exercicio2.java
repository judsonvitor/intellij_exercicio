package Parte2LeituraDeDados;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite a sua idade: ");
        int idade = Integer.parseInt(scanner.nextLine());


        System.out.println("A sua idade é: " + idade + "?");







        scanner.close();
    }

}
