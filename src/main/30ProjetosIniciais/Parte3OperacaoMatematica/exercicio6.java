package Parte3OperacaoMatematica;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite a primeira nota para saber a média: ");
        double nota1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite a segunda nota: ");
        double nota2 = Double.parseDouble(scanner.nextLine());


        double media = (nota1 + nota2) / 2;

        System.out.println("A média foi de: " +media);


        scanner.close();
    }
}
