package exercicio3032;

import java.util.Scanner;

public class mediaDaNota {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite sua primeira nota: ");
        double nota1 = Double.parseDouble(scanner.nextLine());


        System.out.println("digite sua segunda nota: ");
        double nota2 = Double.parseDouble(scanner.nextLine());


        double media = (nota1 + nota2) / 2;

        System.out.printf("Média: %.2f%n", media );





scanner.close();

    }
}
