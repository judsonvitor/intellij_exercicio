package tiposDeMetodosExercicio;

import java.util.Scanner;

public class exercicio11 {
    public static double imposto(double salario1) {
        if (salario1 <= 2000){
            System.out.println("Isento de imposto.");
        }

        else if (salario1 > 2000 && salario1 <= 5000) {
            System.out.println("Imposto de 10%");
            return  salario1 - (salario1 * 0.10);

        } else {
            System.out.println("Imposto de 20%");
            return salario1 - (salario1 * 0.20);
        }

        return salario1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salário atual:");
        double salario1 = Double.parseDouble(scanner.nextLine());



    double conta = imposto(salario1);

        System.out.println("Com imposto fica: " + conta);


      scanner.close();
    }
}
