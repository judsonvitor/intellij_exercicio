package TiposDeMetodos;

import java.util.Scanner;

public class praticando5 {
    static double calcularimc (double peso, double altura) {
        return peso / (altura * altura);
    }
    static String classificarIMC (double imc) {
        if ( imc < 18.5 ){
            return "Abaixo do peso.";
        }
        if (imc < 25 ) {
            return "Peso normal.";
        }
        if (imc < 30) {
            return "Acima do peso.";
        }
        return "Obesidade";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso em Kg: ");
        double peso = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite su altura em metros: ");
        double altura = Double.parseDouble(scanner.nextLine());


        double imc = calcularimc(peso, altura);

        System.out.printf("IMC: %.2f%n", imc);
        System.out.println("Classificação: " + classificarIMC(imc));

        scanner.close();


    }





















}
