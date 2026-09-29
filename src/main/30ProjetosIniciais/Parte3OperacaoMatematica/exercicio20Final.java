package Parte3OperacaoMatematica;

import java.util.Scanner;

public class exercicio20Final {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o valor total da compra.");
    String textto = scanner.nextLine();
    double compra = Double.parseDouble(textto);


    System.out.println("Digite o total de pessoas que você quer dividir a compra. ");
    textto = scanner.nextLine();
    double pessoas = Double.parseDouble(textto);



    double soma = compra / pessoas;

    System.out.println("A quantidade que irá sair para cada um será de: " + soma);





        scanner.close();
    }
}
