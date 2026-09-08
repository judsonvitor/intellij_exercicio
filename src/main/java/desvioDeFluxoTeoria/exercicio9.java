package desvioDeFluxoTeoria;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o primeiro número: ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o segundo número: ");
        int num2 = Integer.parseInt(scanner.nextLine());



        if (num1 == num2) {
            System.out.println("Ambos são iguas. ");
        } else if (num1 > num2) {
            System.out.println("O primeiro número é o maior.");
        } else if ( num1 < num2) {
            System.out.println("O segundo número é maior.");
        }






        scanner.close();

    }
}
