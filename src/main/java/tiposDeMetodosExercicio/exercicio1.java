package tiposDeMetodosExercicio;

import java.util.Scanner;

public class exercicio1 {
    static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base do retângulo:");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite a altura do retângulo:");
        double b = Double.parseDouble(scanner.nextLine());


double area = calcularArea(a, b);

        System.out.println("A área do retângulo é: " + area);

        scanner.close();


    }




































}
