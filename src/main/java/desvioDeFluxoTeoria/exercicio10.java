package desvioDeFluxoTeoria;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o nome do produto: ");
        String nome = scanner.nextLine();


        System.out.println("Digite a quantidade de produtos: ");
        int quantidade = Integer.parseInt(scanner.nextLine());




        if (quantidade < 10 ) {
            System.out.println("o produto:  '" + nome + "' Está com pouco produto.");
        } else if (quantidade > 10) {
            System.out.println("A quantidade do produto : '" + nome + "' está normal." );
        }



        scanner.close();
    }
}
