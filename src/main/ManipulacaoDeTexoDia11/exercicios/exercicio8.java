package exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite 3 palavras ou mais.");
        String palavras = scanner.nextLine();


        String partes = palavras.replace(" " ,"-");

        System.out.println(partes);


        scanner.close();
    }
}