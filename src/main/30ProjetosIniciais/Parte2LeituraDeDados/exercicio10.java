package Parte2LeituraDeDados;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Informe o titulo do livro: ");
        String titulo = scanner.nextLine();

        System.out.println("Informe o nome do autor: ");
        String autor = scanner.nextLine();

        System.out.println("Informe o ano de publicação: ");
        int ano = Integer.parseInt(scanner.nextLine());

        System.out.println("informe o preço do livro: ");
        double preco = Double.parseDouble(scanner.nextLine());

        System.out.println("Título do livro: " + titulo + "\nNome do autor: " + autor + "\nAno que foi publicado: " + ano + "\nPreço: " + preco);




        scanner.close();
    }
}
