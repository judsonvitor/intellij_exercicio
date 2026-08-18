package exercicio3032pesquisando;

import java.util.Scanner;

public class aumentoDeSalario {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite seu salario atual:");
        double salarioAtual = Double.parseDouble(scanner.nextLine());


double calculo = salarioAtual + (salarioAtual * 0.15);


        System.out.printf("parabens! você recebeu um aumento. Seu salário passou a ser : %.2f%n", calculo);


        scanner.close();




    }

}
