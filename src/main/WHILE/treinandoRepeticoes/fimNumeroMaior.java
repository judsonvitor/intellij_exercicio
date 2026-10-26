package treinandoRepeticoes;

import java.util.Scanner;

public class fimNumeroMaior {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String entrada = "";

        int maior = 0;

        System.out.println("Maior número. ");
        System.out.println("Digite dois números. Para parar, digite fim");


        while (!entrada.equalsIgnoreCase("fim")) {

            System.out.println("Digite um número ou fim.");
            entrada = scanner.nextLine();

            if (!entrada.equalsIgnoreCase("fim")) {

               int numerototal = Integer.parseInt(entrada);

                if (numerototal > maior) {
                    maior = numerototal;

                }
            }
        }


        scanner.close();
    }
}
