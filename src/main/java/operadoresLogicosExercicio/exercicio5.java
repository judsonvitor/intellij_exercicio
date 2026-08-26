package operadoresLogicosExercicio;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o primeiro número: ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o segundo número: ");
        int num2 = Integer.parseInt(scanner.nextLine());


        boolean soma = (num1 > 0 && num2 >0);


        System.out.println("os dois são positivos?: " + soma);



        scanner.close();
    }
}
