package operadoresLogicos;

import java.util.Scanner;

public class primeiroMaiorQueOsegundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("digite o primeiro número: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("digite o segundo número: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("são iguais: " + (a == b ));
        System.out.println("O primeiro é maior: " + ( a > b ));

        scanner.close();

    }
}
