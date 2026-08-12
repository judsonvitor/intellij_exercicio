package matematica;

import java.util.Scanner;

public class leituraDeDoisNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o primeiro número: ");
        double numero1 = Double.parseDouble(scanner.nextLine());


        System.out.println("digite o segundo numero: ");
       double numero2 = Double.parseDouble(scanner.nextLine());


        System.out.println("soma: "  + (numero1 + numero2));
        System.out.println("Subtração: " + (numero1 - numero2));
        System.out.println("multiplicação: " + (numero1 * numero2));
        System.out.println("divisão: " + (numero1 / numero2));





       scanner.close();
    }
}
