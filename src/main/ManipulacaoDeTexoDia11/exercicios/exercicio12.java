package exercicios;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite uma palavra.");
        String palavra = scanner.nextLine();

        if (!palavra.isEmpty()) {
            char primeira = palavra.charAt(0);
            char ultimaLetra = palavra.charAt(palavra.length() - 1);

            System.out.println("A primeira letra da palavra é: " + primeira);
            System.out.println("A ultima letra da palavra é: " + ultimaLetra);
        } else {
            System.out.println("Nenhuma palavra identificada.");
        }



scanner.close();
    }
}
