package Parte3OperacaoMatematica;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o primeiro número para saber o resto da divisão. ");
        String texto = scanner.nextLine();
        int numero1 = Integer.parseInt(texto);

        System.out.println("Digite o seundo número: ");
        texto = scanner.nextLine();
        int numero2 = Integer.parseInt(texto);


        int soma = numero1 % numero2;

        System.out.println("A resultado da divisão foi de: " + soma);


scanner.close();
    }
}
