package desvioDeFluxoTeoria;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite sua idade: ");
        int idade = Integer.parseInt(scanner.nextLine());


        if (idade >= 16) {
            System.out.println("Pode votar.");
        } else if (idade < 16) {
            System.out.println("Não pode votar.");
        }

        scanner.close();
    }
}
