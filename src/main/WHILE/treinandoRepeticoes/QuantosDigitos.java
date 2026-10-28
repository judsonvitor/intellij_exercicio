package treinandoRepeticoes;

import java.util.Scanner;

public class QuantosDigitos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numeroconta = 0;

        System.out.println("Digite um número inteiro para saber quantos digitos ele possui.");
        int numero = Integer.parseInt(scanner.nextLine());

        while (numero!=0) {

            numero = numero /10;
            numeroconta++;

        }

        System.out.println("Quantidade de números: " + numeroconta);


        scanner.close();
    }
}
