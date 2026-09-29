package Parte3OperacaoMatematica;

import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Me diga o preço final do produto: ");
        String texto = scanner.nextLine();
        double preco = Double.parseDouble(texto);


        System.out.println("Agora me diga o percentual de desconto. ");
        texto = scanner.nextLine();
        int percentual = Integer.parseInt(texto);


        double valorDeDesconto = preco * percentual /100;
        double precofinal = preco - valorDeDesconto;

        System.out.println("Com o desconto de " +percentual+ "% fica com o valor total de: " +precofinal);

        scanner.close();
    }
}
