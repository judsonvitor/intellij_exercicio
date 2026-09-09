package DesvioDeFluxoSWITCHcase;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Será que o dia é útil, ou é final de semana? me informe um número.");
        int numero = Integer.parseInt(scanner.nextLine());




        switch (numero) {
            case 1, 2, 3, 4, 5 -> System.out.println("É apenas um dia normal, e não feriado...");
            case 6, 7 -> System.out.println("É final de semanaaaa, vamos aproveitar em nossos hobbys!!!");
            default -> System.out.println("Número não identificado.");
        }





        scanner.close();

    }
}
