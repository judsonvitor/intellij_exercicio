package Parte2LeituraDeDados;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);



        System.out.print("Cadasrtro do funcionário.\n\n");

        System.out.println("Favor digitar seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe seu cargo: ");
        String cargo = scanner.nextLine();

        System.out.println("Digite seu salário: ");
        double salario = Double.parseDouble(scanner.nextLine());

        System.out.println("Agora informe seu número de identificação: ");
        int identificacao = Integer.parseInt(scanner.nextLine());


        System.out.println("Nome " + nome + "\nCargo: " + cargo + "\nSalário: " + salario + "\nNúmero de identificação: " + identificacao);


        scanner.close();
    }
}
