package Parte2LeituraDeDados;

import java.util.Scanner;

public class exercicio4 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite sua altura: ");
        double altura = Double.parseDouble(scanner.nextLine());


        System.out.println("Voce tem a altura de: " +altura+ " Metros");

scanner.close();
    }
}
