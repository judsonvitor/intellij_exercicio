package treinandoRepeticoes;

import java.util.Scanner;

public class usuarioDigitando {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int usuario = 0;

        int numeros = -1;


        System.out.println("---Programa de soma acumulada---");
        System.out.println("Digite os número que você deseja somar ( 0 para fazer a soma e fechar)");

        while (numeros != 0) {
            System.out.println("Digite os números: ");
            numeros = Integer.parseInt(scanner.nextLine());

           usuario = usuario + numeros;
        }

        System.out.println("A soma total de numeros é: " + usuario);


        scanner.close();
    }
}
