package exercicios;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite seu número de telefone: EX: (34) 33333-5555.\n");
        String numero = scanner.nextLine();




        String trocando = numero.replaceAll("[^0-9]" , "");

        System.out.println("Seu número de telefone sem nenhuma caractere." + trocando);


        scanner.close();
    }
}
