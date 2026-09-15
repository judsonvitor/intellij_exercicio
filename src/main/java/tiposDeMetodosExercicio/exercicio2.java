package tiposDeMetodosExercicio;

import java.util.Scanner;

public class exercicio2 {
    static double calcularcelsius(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em celsius: ");
        double c = Double.parseDouble(scanner.nextLine());


        double calc = calcularcelsius(c);

        System.out.printf("A temperaura de celsius convertida para fahrenheit é: %.1f°%n ", calc);



    scanner.close();

    }














}
