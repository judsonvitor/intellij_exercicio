package concatenacaoexerciciopg38;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("insira o valor da compra: ");
        double valor = Double.parseDouble(scanner.nextLine());

      valor += 9.90;

        System.out.printf("o valor da compra com o frete ficou: R$ %.2f%n ", valor);



        scanner.close();
    }
}
