package tiposDeMetodosExercicio;

import java.util.Scanner;

public class exercicio9 {
    static double salariobruto(double bruto, double porcentual) {
        return bruto - (bruto * porcentual);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salário bruto sem ponto e vírgula: ");
        double bruto = Double.parseDouble(scanner.nextLine());


        System.out.println("Digite a porcentagem:\n\nEXEMPLO: 0.20 para 20%.");
        double porcento = Double.parseDouble(scanner.nextLine());



        double porcentual = porcento;

        double calculototal = salariobruto(bruto, porcentual );


        System.out.printf("Seu salário líquido e com desconto de fica: %.2f" ,calculototal);





    scanner.close();
    }
}



