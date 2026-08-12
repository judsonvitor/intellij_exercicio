package matematica;

import java.util.Scanner;

public class CalcularIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento");
int anoNascimento = Integer.parseInt(scanner.nextLine());


int idade = 2026 - anoNascimento;

        System.out.println("Você tem ou fará " + idade + " anos em 2026.");



    }
}
