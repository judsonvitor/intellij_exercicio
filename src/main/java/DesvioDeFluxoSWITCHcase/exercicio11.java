package DesvioDeFluxoSWITCHcase;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7 e eu te informo o dia da semana!!!");
        int semana = Integer.parseInt(scanner.nextLine());

        switch (semana) {
            case 1 -> System.out.println("Segunda");
            case 2 -> System.out.println("Terça");
            case 3 -> System.out.println("Quarta");
            case 4 -> System.out.println("Quinta");
            case 5 -> System.out.println("Sexta");
            case 6 -> System.out.println("Sabádo");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Número inválido.");
        }


        System.out.println("possuí diferença apenas na forma que você escreve esse método, não percebi outra alteração comparado ao exercicio 5 do dia 8.");

        scanner.close();
    }
}
