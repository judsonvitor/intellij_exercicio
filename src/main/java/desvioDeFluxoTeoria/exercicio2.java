package desvioDeFluxoTeoria;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua nota.");
        double nota = Double.parseDouble(scanner.nextLine());


        if (nota >= 8) {
            System.out.println("Aprovado. ");
        } else if (nota >= 6) {
            System.out.println("Recuperação.");
        } else if (nota <= 5 ) {
            System.out.println("Reprovado");
        }





scanner.close();
    }
}
