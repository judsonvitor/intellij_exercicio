package desvioDeFluxoTeoria;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um número de 1 a 7 para saber o dia da semana.");
        int semana = Integer.parseInt(scanner.nextLine());


        if (semana == 1) {
            System.out.println("É Segunda-feira.");
        } else if (semana == 2) {
            System.out.println("É Terça-feira.");
        } else if (semana == 3) {
            System.out.println("É Quarta-feira.");
        } else if (semana == 5) {
            System.out.println("É Quinta-feira. ");
        } else if (semana == 6) {
            System.out.println("É Sexta-feira. ");
        }  else if (semana == 7){
            System.out.println("É Sabádo!!!.");
        }










        scanner.close();

        }

    }