package Parte3OperacaoMatematica;

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Me diga quantos km você rodou e eu faço a conversão para metros");
        String texto = scanner.nextLine();
        double quilometros = Double.parseDouble(texto);

        double metros = quilometros * 1000;


        System.out.println("Em metros ficou: " + metros);


    scanner.close();
    }
}
