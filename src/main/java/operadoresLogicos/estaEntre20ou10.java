package operadoresLogicos;

import java.util.Scanner;

public class estaEntre20ou10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um número: ");
        int numero1 = Integer.parseInt(scanner.nextLine());

        boolean dentroDaFaixa = numero1 >= 10 && numero1 <= 20;


        System.out.println("Está entre 10 e 20: " + dentroDaFaixa);
        scanner.close();



    }
}
