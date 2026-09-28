package Parte3OperacaoMatematica;

import java.util.Scanner;

public class exercio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número com casas decimais: ");
        String texto = scanner.nextLine();
        double numero1 = Double.parseDouble(texto);


        System.out.println("Digite o segundo número com casas deciamis: ");
        texto = scanner.nextLine();
        double numero2 = Double.parseDouble(texto);



        double soma = numero1 - numero2;


        System.out.println("A diferença entre amboas é de: " +soma);





        scanner.close();
    }
}
