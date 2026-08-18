package exercicio3032pesquisando;

import java.util.Scanner;

public class conversaoEmDolar {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);


        System.out.println("digite o valor em reais: ");
        double reais = Double.parseDouble(scanner.nextLine());


        System.out.println("digite a cotação em dólar: ");
        double dolar = Double.parseDouble(scanner.nextLine());


        double dolares = reais / dolar;


        System.out.printf("o valor em dolar é: %.2f%n", dolares);

scanner.close();
    }
}
