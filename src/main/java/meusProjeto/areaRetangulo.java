package meusProjeto;

import java.util.Scanner;

public class areaRetangulo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a base");

        double base = Double.parseDouble(scanner.nextLine());

        System.out.println("digite altura");

        Double altura = Double.parseDouble(scanner.nextLine());

        double area = base * altura;


        System.out.println(area);



        scanner.close();
    }
}
