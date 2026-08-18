package exercicio3032;

import java.util.Scanner;

public class desconto {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("digite o valor da compra: ");
        double valor = Double.parseDouble(scanner.nextLine());



        double desconto = valor * 0.10;
        double valorFinal = valor - desconto;


        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("valor final: R$ %.2f%n", valorFinal);


scanner.close();



    }
}
