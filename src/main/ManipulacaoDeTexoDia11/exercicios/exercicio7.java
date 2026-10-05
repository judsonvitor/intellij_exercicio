package exercicios;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite a data, EX: 23/09/2031 :\n ");
        String data = scanner.nextLine();

        String [] partes = data.split("/");

        System.out.println("Dia: " + partes [0]);
        System.out.println("Mês: " + partes [1]);
        System.out.println("Ano: " + partes [2]);

        scanner.close();
    }
}
