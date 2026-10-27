package treinandoRepeticoes;

import java.util.Scanner;

public class checagemDeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite a sua idade.");
       int idade = Integer.parseInt(scanner.nextLine());



        while (idade < 0) {
            System.out.println("idade incorreta. Por favor certifique-se que está digitando\ncorretamente ou tente novamete no próximo dia útil.");
            idade = Integer.parseInt(scanner.nextLine());



            if (idade >=0) {
                System.out.println("idade correta. Dessa vez passou.");

            } else {
                System.out.println("Beleza. ");
            }









            scanner.close();
        }
    }
}