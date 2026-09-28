package Parte3OperacaoMatematica;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número que você deseja dividir: ");
        String texto = scanner.nextLine();
        double numero1 = Double.parseDouble(texto);

        System.out.println("Agora digite o segundo: ");
        texto= scanner.nextLine();
        double numero2 = Double.parseDouble(texto);



        double soma = numero1 / numero2;

        System.out.println("A soma é: "+soma);


        scanner.close();
    }

}

