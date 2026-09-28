package Parte3OperacaoMatematica;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número: ");
        String texto = scanner.nextLine();
        double numero1 = Double.parseDouble(texto);

        double sucessor = numero1 + 1;
        double antecessor = numero1 - 1;

        System.out.println("Número informado: " +numero1 + "\n Sucessor: " +sucessor+ "\n Antecessor: "+ antecessor);
        scanner.close();

    }
}
