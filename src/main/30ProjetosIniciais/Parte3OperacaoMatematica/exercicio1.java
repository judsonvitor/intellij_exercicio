package Parte3OperacaoMatematica;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro número: \n");
        String texto = scanner.nextLine();
        int numero1 = Integer.parseInt(texto);


        System.out.println("Digite o segundo número para a soma: ");
        texto = scanner.nextLine();
        int numero2 = Integer.parseInt(texto);


        int soma = numero1 + numero2;


        System.out.println("Primeiro número: " +numero1+ "\nSegundo número: " +numero2+"\nsoma total: " +soma);

        scanner.close();
    }
}
