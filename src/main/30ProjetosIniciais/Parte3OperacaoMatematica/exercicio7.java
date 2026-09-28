package Parte3OperacaoMatematica;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        String texto = scanner.nextLine();
        double nota1 = Double.parseDouble(texto);

        System.out.println("Digite a segunda nota: ");
        texto = scanner.nextLine();
        double nota2 = Double.parseDouble(texto);

        System.out.println("Digite a terceira nota: ");
        texto = scanner.nextLine();
        double nota3 = Double.parseDouble(texto);

        System.out.println("Digite a quarta nota: ");
        texto = scanner.nextLine();
        double nota4 = Double.parseDouble(texto);




        double media = (nota1 + nota2 + nota3 + nota4 ) / 2;


        System.out.println("A média das 4 notas foram de: " + media);



        scanner.close();
    }
}
