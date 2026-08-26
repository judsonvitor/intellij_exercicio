package operadoresLogicosExercicio;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite algum número: ");
        int numero = Integer.parseInt(scanner.nextLine());



        boolean ehpar = (numero %2 == 0);


        System.out.println("o numero é par?: " + ehpar);



        scanner.close();
    }
}
