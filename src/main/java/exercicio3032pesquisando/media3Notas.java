package exercicio3032pesquisando;

import java.util.Scanner;

public class media3Notas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("digite a primeira nota: ");
        double nota1 = Double.parseDouble(scanner.nextLine());

        System.out.println("digite a segunda nota: ");
        double nota2 = Double.parseDouble(scanner.nextLine());


        System.out.println("digite a terceira nota: ");
        double nota3 = Double.parseDouble(scanner.nextLine());



        double media = (nota1 + nota2 + nota3)  /2;

        System.out.printf("Média: %.2f%n", media);

        scanner.close();

    }
}
