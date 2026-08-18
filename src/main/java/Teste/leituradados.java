package Teste;

import java.util.Locale;
import java.util.Scanner;

public class leituradados {
    public static void main(String[] args) {

        double x = 10.35784;
        String nome = "maria";
        int idade = 31;
        double salario = 4500.60;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");

        if (scanner.next().equalsIgnoreCase(nome)) {
            Locale.setDefault(Locale.US);
            System.out.println("Funcionário: " + nome);
            System.out.printf("Salário: %.2f%n", salario);
            System.out.println("Idade: " + idade);
        }

        scanner.close();
    }
}
