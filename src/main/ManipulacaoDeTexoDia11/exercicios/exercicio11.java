package exercicios;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite a primeira palavra.");
        String palavra1 = scanner.nextLine();

        System.out.println("Digite a segunda palavra.");
        String palavra2 = scanner.nextLine();

        if (palavra1.equals(palavra2)) {
            System.out.println("A primeira palavra é totalmente identica a segunda");
        } else {
            System.out.println("A segunda palavra não é identica a primeira.");


            scanner.close();
        }
    }
}
