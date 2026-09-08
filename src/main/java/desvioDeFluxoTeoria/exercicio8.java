package desvioDeFluxoTeoria;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura: ");
        int temperatura = Integer.parseInt(scanner.nextLine());


        if (temperatura <= 14) {
            System.out.println("Está frio.");

        } else if (temperatura >= 15 && temperatura <= 25) {
            System.out.println("O clima está ameno.");
        } else if (temperatura > 25) {
            System.out.println("Está quente.");
        }



        scanner.close();
    }

}
