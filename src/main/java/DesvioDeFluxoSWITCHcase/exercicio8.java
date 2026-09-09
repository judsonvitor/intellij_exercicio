package DesvioDeFluxoSWITCHcase;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Arroz / 7282462 \n");
        System.out.print("Feijão / 2345594 \n");
        System.out.print("Frango / 2348692 \n");



        System.out.println("\nDigite o código do produto você quer levar.");
        int produto = Integer.parseInt(scanner.nextLine());


        String code= switch (produto) {
            case 7282462 -> ("arroz");
            case 2345594 -> ("feijao");
            case 2348692 -> ("frango");

            default -> "Produto não encontrado";
        };
        System.out.println("O produta é: " + code);




    }
}
