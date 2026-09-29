package Parte3OperacaoMatematica;

import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o preço do produto: ");
        String texto = scanner.nextLine();
        double preco = Double.parseDouble(texto);

        System.out.println("Agora digite a quantidade do produto: ");
        texto= scanner.nextLine();
        int quantidade = Integer.parseInt(texto);


        double soma = preco * quantidade;

        System.out.println("O valor total do produto foi de: " + soma);



        scanner.close();

    }
}
