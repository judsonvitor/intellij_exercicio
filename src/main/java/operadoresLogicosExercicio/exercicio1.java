package operadoresLogicosExercicio;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite sua idade: ");
        int idade = Integer.parseInt(scanner.nextLine());


        System.out.println("Maior de idade: " + (idade >=18 ));


        scanner.close();
    }
}
