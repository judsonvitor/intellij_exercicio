package meusProjeto;

import java.util.Scanner;

public class trocoDeCompra {
    public static void main (String[] args){
         Scanner scanner = new Scanner(System.in);


        System.out.println("digite o valor da compra");
        double valorDaCompra = Double.parseDouble(scanner.nextLine());



        System.out.println("digite o valor pago");
        double ValorPago = Double.parseDouble(scanner.nextLine());

        double troco = ValorPago - valorDaCompra;

        System.out.println("troco");
        System.out.println(troco);




scanner.close();

    }
}
