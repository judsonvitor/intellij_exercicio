package Parte2LeituraDeDados;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("digite o nome da sua cidade: ");
        String cidade = scanner.nextLine();

        System.out.println("digite a sigla de seu estado: ");
        String sigla = scanner.nextLine();


        System.out.println("A sua cidade é: " +cidade+ "--" + sigla);




        scanner.close();






    }
}
