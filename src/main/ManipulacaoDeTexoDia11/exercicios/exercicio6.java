package exercicios;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite seu nome e sobrenome: ");
        String nome = scanner.nextLine();

        int contador = nome.length();
        boolean revisar = nome.contains(" ");


        if (contador >= 5 && !revisar) {
            System.out.println("Usuário válido.");
        } else {
            System.out.println("Usuário inválido.");
















scanner.close();
    }
}
}
