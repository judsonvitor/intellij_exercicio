package DesvioDeFluxoSWITCHcase;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um número de 1 a 4, e eu te digo qual estação do ano será no hemisfério sul (Brasil)!");
        int estacao = Integer.parseInt(scanner.nextLine());


        switch (estacao){
            case 1 -> System.out.println("Verão.");
            case 2 -> System.out.println("Outono.");
            case 3 -> System.out.println("Inverno.");
            case 4 -> System.out.println("Primavera.");
            default -> System.out.println("Número inválido.");
        }



scanner.close();
    }
}
