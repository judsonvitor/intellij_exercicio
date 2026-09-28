package Parte3OperacaoMatematica;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o número que deseja dobrar por 3: ");
        String texto = scanner.nextLine();
        double numero1 = Double.parseDouble(texto);



        double soma = numero1 * 3;

        System.out.println("O resultado é de: "+ soma);



        scanner.close();

    }
}
