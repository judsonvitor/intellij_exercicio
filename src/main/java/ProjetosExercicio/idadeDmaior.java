package meusProjeto;

import java.util.Scanner;

public class idadeDmaior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("digite sua idade.");
        double idade= Double.parseDouble(scanner.nextLine());



if (idade <= 17) {
    System.out.println("voce é menor de idade.");
} else {
    System.out.println("voce é maior de idade");
}





    }
}