package operadoresLogicosExercicio;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu email: ");
        String email = scanner.nextLine();

        boolean entra = email.contains("@") && email.endsWith("gmail.com");


        System.out.println(entra);

scanner.close();


    }
}
