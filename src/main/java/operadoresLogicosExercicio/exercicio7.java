package operadoresLogicosExercicio;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("qual sua idade?: ");
        int idade = Integer.parseInt(scanner.nextLine());



        boolean aprovado = !(idade <=18 );


        System.out.println("maior de 18: " + aprovado);

        scanner.close();

    }
}
