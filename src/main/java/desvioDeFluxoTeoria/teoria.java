package desvioDeFluxoTeoria;

import java.util.Scanner;

public class teoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        int nota = Integer.parseInt(scanner.nextLine());

        if (nota >= 9 ) {
            System.out.println("você tirou nota A.");
        } else if (nota >= 7) {
            System.out.println("você tirou nota B.");
        } else if (nota >= 6) {
            System.out.println("você tirou nota C.");
        } else if (nota <= 5) {
            System.out.println("você ficou em recuperacão com nota D.");
        }

scanner.close();
    }
}
