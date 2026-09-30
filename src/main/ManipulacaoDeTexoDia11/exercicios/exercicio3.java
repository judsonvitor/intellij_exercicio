package exercicios;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome completo e certifique-se que não possuí espaço no final.");
        String nome = scanner.nextLine();

        int ultimo = nome.lastIndexOf(" ");
        String ultimonome = nome.substring(ultimo + 1);


        System.out.println("Seu ultimo sobrenome é: " +ultimonome);


        scanner.close();
    }
}
