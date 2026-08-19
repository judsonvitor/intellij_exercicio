package concatenacaoexerciciopg38;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salário atual: ");
        double salario = Double.parseDouble(scanner.nextLine());

        salario *= 1.10;
        System.out.printf("seu salário teve com aumento fica: R$ %.2f%n ", salario);


        scanner.close();
    }
}
