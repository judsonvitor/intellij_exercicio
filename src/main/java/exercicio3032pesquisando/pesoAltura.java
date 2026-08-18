package exercicio3032pesquisando;

import java.util.Scanner;

public class pesoAltura {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("digite seu peso: ");
        double peso = Double.parseDouble(scanner.nextLine());


        System.out.println("digite sua altura: ");
        double altura = Double.parseDouble(scanner.nextLine());


        System.out.printf("peso: %.2f%n", peso);
        System.out.printf("altura: %.2f", altura);



        scanner.close();







    }
}
