package concatenacao;

import java.util.Scanner;

public class trocaDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int a = Integer.parseInt(scanner.nextLine());


        System.out.println("digite o segundo numero: ");
        int b = Integer.parseInt(scanner.nextLine());


        int auxiliar = a;
        a = b;
        b = auxiliar;

        System.out.println("a = " + a);
        System.out.println("b = " + b);









    }
}
