package concatenacao;

import java.util.Scanner;

public class analisandopg35 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        int itens = 0;


        System.out.println("Digite o preço do primeiro produto: ");
        total += Double.parseDouble(scanner.nextLine());
        itens++;

        System.out.println("Digite o preço do segundo produto: ");
        total += Double.parseDouble(scanner.nextLine());
        itens ++;


        System.out.println("Digite om preço do terceiro produto: ");
        total += Double.parseDouble(scanner.nextLine());
        itens ++;





        System.out.printf("Itens no carrinho: %d%n", itens);
        System.out.printf("subtotal: %.2f%n",total);

        total += 9.90;
        System.out.printf("Total com frete: %.2f%n", total);



        total *= 0.9;
        System.out.printf("total com 10%% de desconto: R$ %.2f%n", total);

        scanner.close();






    }
}
