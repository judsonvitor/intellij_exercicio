package operadoresLogicosExercicio;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();



        boolean ehAdmin = nome.equalsIgnoreCase("admin");


        System.out.println("É administrador? " + ehAdmin);


        scanner.close();
    }
}
