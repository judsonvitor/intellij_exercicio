package DesvioDeFluxoSWITCHcase;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Me fale sua nota! (igual nos EUA)");
        String nota = scanner.nextLine().strip().toLowerCase();

        switch (nota){

            case "a" -> System.out.println("Excelente.");
            case "b" -> System.out.println("Bom.");
            case "c" -> System.out.println("Regular.");
            case "d" -> System.out.println("Abaixo da média.");
            default -> System.out.println("Nota não cadastrada.");
        }


        scanner.close();
    }
}
