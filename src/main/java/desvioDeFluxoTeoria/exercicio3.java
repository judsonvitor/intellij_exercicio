package desvioDeFluxoTeoria;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Quantos dias teve em fevereiro?: ");
        int dias = Integer.parseInt(scanner.nextLine());



        if (dias == 29) {
            System.out.println("O ano é bissexto \uD83E\uDD73");
        } else if (dias <= 28) {
            System.out.println("O ano é apenas um ano normal.");
        }

scanner.close();
    }
}
