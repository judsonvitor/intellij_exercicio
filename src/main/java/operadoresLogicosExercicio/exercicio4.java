package operadoresLogicosExercicio;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o primeiro número: ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o segundo número: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o terceiro número: ");
        int num3 = Integer.parseInt(scanner.nextLine());



boolean soma = (num1 < 0 || num2 <0 || num3 <0);

        System.out.println("apenas um é negativo?: " + soma);

        scanner.close();





    }
}
