package exercicio3032pesquisando;

import java.util.Scanner;

public class somaDeDoisNumeros {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        System.out.println("digite o primeiro número: ");
        double numero1 = Double.parseDouble(scanner.nextLine());

        System.out.println("digite o segundo número: ");
        double numero2 = Double.parseDouble(scanner.nextLine());


        System.out.println("a soma é de: " + (numero1 + numero2));





    }
}
