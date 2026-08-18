package exercicio3032pesquisando;

import java.util.Scanner;

public class parcelas { public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);


    System.out.println("digite o valor da compra:");
    double valorDaCompra = Double.parseDouble(scanner.nextLine());


    System.out.println("digite o valor de parcelas: ");
    int parcelas = Integer.parseInt(scanner.nextLine());



    double valorDaParcelas = valorDaCompra / parcelas;


    System.out.printf("Sua compra de R$ %.2f foi parcelada em %dx vezes %n", valorDaCompra, parcelas);
    System.out.printf("o valor de cada parcela será: R$ %.2f%n", valorDaParcelas);


    scanner.close();










}

}
