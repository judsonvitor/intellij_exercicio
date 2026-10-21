package TreinandoRepeticoes;

import java.util.Scanner;

public class fatorialDeProduto {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = Integer.parseInt(scanner.nextLine());

        long fatorial = 1;
        int contador = numero;

        while (contador > 1) {
            fatorial *= contador;
            contador --;
        }

        System.out.println(numero + "! = " + fatorial);

        scanner.close();



    }
}
