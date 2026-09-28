package Parte3OperacaoMatematica;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite a largura do retangulo: ");
        String texto = scanner.nextLine();
        double largura = Double.parseDouble(texto);

        System.out.println("Agora digite a altura do retangulo: ");
        texto = scanner.nextLine();
        double altura = Double.parseDouble(texto);


        double soma = (largura + altura ) / 2;


        System.out.println("A área é de: " +soma);



        scanner.close();
    }
}
