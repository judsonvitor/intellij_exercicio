package exercicios;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite alguma coisa: ");
        String frase = scanner.nextLine();


        String[] palavras = frase.split(" ");
        int quantidade = palavras.length;

        System.out.println("A quantidade de palavras dessa frase ou palavra é de: " + quantidade);



        scanner.close();

    }
}
