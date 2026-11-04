package treinandoRepeticoes.usuario;

import java.util.Scanner;

public class math {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numerosortead = (int) (Math.random() * 100) + 1;
        int palpite = 0;

        System.out.println("Digite um numero de 1 a 100.");
        System.out.println(numerosortead);

        while (palpite != numerosortead) {
            System.out.println("Digite: ");
            palpite = scanner.nextInt();

            if (palpite < numerosortead) {
                System.out.println("o numero digitado foi menor que o numero.");

            } else if (palpite > numerosortead) {
                System.out.println("Seu palpite foi maior que o numero digitado.");

            } else if (numerosortead == palpite){
                System.out.println("Parabéns. Não sei como você acertou");
            }
        }

        scanner.close();

    }
}
