package DesvioDeFluxoSWITCHcase;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual mês estamos? *Digite com números*.");
        int mes = Integer.parseInt(scanner.nextLine());


        switch (mes) {
            case 1 -> System.out.println("O mês possuí 31 dias!!!");
            case 3 -> System.out.println("O mês possuí 31 dias!!!");
            case 5 -> System.out.println("O mês possuí 31 dias!!!");
            case 7 -> System.out.println("O mês possuí 31 dias!!!");
            case 8 -> System.out.println("O mês possuí 31 dias!!!");
            case 10 -> System.out.println("O mês possuí 31 dias!!!");
            case 12 ->  System.out.println("O mês possuí 31 dias!!!");
            case 2 -> System.out.println("O mês possuí 28 dias ou 29 se o ano for bissexto.");
            case 4 -> System.out.println("O mês possuí 30 dias!!!");
            case 6 -> System.out.println("O mês possuí 30 dias!!!");
            case 9 -> System.out.println("O mês possuí 30 dias!!!");
            case 11 -> System.out.println("O mês possuí 30 dias!!!");
            default -> System.out.println("Número inválido.");
        }








scanner.close();



    }
}
