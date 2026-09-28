package Parte3OperacaoMatematica;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Apresente algum número decimal: ");
        String texto = scanner.nextLine();
        double numero1 = Double.parseDouble(texto);

        double soma = numero1 / 2;


        System.out.println("A metade do número decimal é de: "+ soma);




        scanner.close();
    }
}
