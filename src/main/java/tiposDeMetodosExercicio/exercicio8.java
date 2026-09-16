package tiposDeMetodosExercicio;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class exercicio8 {
    public static String indentificador() {
        return ("Boa-vindas");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome para fins de cadastro: ");
        String nome = scanner.nextLine();

        System.out.println("Olá " + nome + indentificador());




        scanner.close();
    }
}