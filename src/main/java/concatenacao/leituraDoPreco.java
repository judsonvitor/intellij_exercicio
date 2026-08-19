package concatenacao;

import java.util.Scanner;

public class leituraDoPreco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o preço do primeiro produto com centavos: ");
        double preco = Double.parseDouble(scanner.nextLine());

        preco *= 1.15;

        System.out.printf("Preço com aumento: R$ %.2f%n", preco);

        scanner.close();





    }
}
