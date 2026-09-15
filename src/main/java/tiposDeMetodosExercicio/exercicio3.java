package tiposDeMetodosExercicio;

import java.util.Scanner;

public class exercicio3 {
    static void apresentarCabecalho(String titulo) {
        System.out.printf("********************************%n");
        System.out.print(titulo + ":");
        System.out.printf("%n********************************");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o titulo que desejas no cabeçario: ");
        String titulo2 = scanner.nextLine();


        apresentarCabecalho(titulo2);






        scanner.close();


    }


}
