package TreinandoRepeticoes;

import java.util.Scanner;

public class tabuadaUsarioDigitando {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um número de 0 a 10 para saber a tabuada: ");
        int numero = Integer.parseInt(scanner.nextLine());

        int multiplicador = 1;

        while (multiplicador <= 10){
            System.out.println(numero + " X " + multiplicador + " = " + (numero * multiplicador));
            multiplicador++;
        }


scanner.close();
    }
}
