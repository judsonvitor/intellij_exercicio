package Parte2LeituraDeDados;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o nome do produto: ");
        String produto = scanner.nextLine();

        System.out.println("Digite o código do produto: ");
        int codigo = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o preço do produto: ");
        double preco = Double.parseDouble(scanner.nextLine());

        System.out.println("Qual a quantidade disponível?: ");
        int quantidade = Integer.parseInt(scanner.nextLine());


        System.out.println("Nome do produto: "+ produto+ "\nCódigo do prooduto: "+ codigo + "\nPreço: "+ preco + "\nQuantidade: "+ quantidade+ "\nEssas são as informações do protudo.");


        scanner.close();
    }
}
