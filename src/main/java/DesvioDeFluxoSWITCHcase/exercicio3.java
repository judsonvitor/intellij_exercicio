package DesvioDeFluxoSWITCHcase;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("De 1 a 5, quanto você tirou no teste de admissão?");
        int numero = Integer.parseInt(scanner.nextLine());


        switch (numero) {
            case 1 -> System.out.println("Péssimo.");
            case 2 -> System.out.println("Ruim.");
            case 3 -> System.out.println("Regular.");
            case 4 -> System.out.println("Bom.");
            case 5 -> System.out.println("Incrível.");
            default -> System.out.println("Número inválido.");

        }
    }
}
