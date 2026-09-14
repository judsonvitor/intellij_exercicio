package TiposDeMetodos;

import java.util.Scanner;

public class praticando3 {
    static double  aplicarDesconto (double valor, double percentual) {
        double desconto = valor * (percentual / 100);
        return valor - desconto;

    }  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valor = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o percentual de desconto:");
        double percentual = Double.parseDouble(scanner.nextLine());

        double valorFinal = aplicarDesconto(valor, percentual);
        System.out.printf("Valor final: %.2f", valorFinal);




scanner.close();
    }













}
