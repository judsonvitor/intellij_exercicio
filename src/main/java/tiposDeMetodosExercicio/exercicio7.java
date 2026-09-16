package tiposDeMetodosExercicio;

import java.util.Scanner;

public class exercicio7 {
    static double calcular1(double dobrar1) {
        return dobrar1 * 2;
    }
    static double calcular2( double dobrar2){
        return dobrar2 * 2;
    }
    static double calcular3(double dobrar3){
        return dobrar3 * 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.printf("Digite um número quebrado que você deseja descobrir o dobro>>>> %nEXEMPLO: 4.66%n:");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o segundo número quebrado que você deseja descobrir o dobro>>>>");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o terceiro número quebrado que você deseja descobrir o dobro>>>>");
        double c = Double.parseDouble(scanner.nextLine());

                    double calculoa = calcular1(a);
                    System.out.printf("O resultado é: %.2f%n", calculoa);

                    double calculob = calcular2(b);
                    System.out.printf("O resultado é: %.2f%n",calculob);

                    double calculoc = calcular3(c);
                    System.out.printf("O resultado é: %.2f%n",calculoc);







    scanner.close();
    }

}
