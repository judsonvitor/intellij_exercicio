package concatenacaoexerciciopg38;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;

        System.out.println("Insira o valor do primeiro produto: ");
        total += Double.parseDouble(scanner.nextLine());


        System.out.println("Insira o valor do segundo produto: ");
        total += Double.parseDouble(scanner.nextLine());


        System.out.println("Insira o valor do terceiro produto: ");
        total += Double.parseDouble(scanner.nextLine());


        System.out.printf("o valor fica: R$ %.2f%n", total);

    }
}
