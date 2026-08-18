package exercicio3032pesquisando;

import java.util.Scanner;

public class baseDoRetangulo {
    public static void main(String[] args){
Scanner scanner = new Scanner(System.in);


        System.out.println("digite a base: ");
        double base = Double.parseDouble(scanner.nextLine());


        System.out.println("digite a altura do retangulo: ");
double altura = Double.parseDouble(scanner.nextLine());

        double area = base * altura;

        System.out.printf("A area é : %.2f%n", area);





        scanner.close();
    }
}
