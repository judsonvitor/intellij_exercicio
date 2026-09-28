package Parte3OperacaoMatematica;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o número que você deseja dividir: ");
        String texto = scanner.nextLine();
        int numero1 = Integer.parseInt(texto);

        System.out.println("Agora digite o segundo: ");
        texto= scanner.nextLine();
        int numero2 = Integer.parseInt(texto);

        System.out.println("Agora digite o terceiro: ");
        texto = scanner.nextLine();
        int numero3 = Integer.parseInt(texto);



        double soma = numero1 * numero2 * numero3;

        System.out.println("A soma é: "+soma);


        scanner.close();
    }
}
