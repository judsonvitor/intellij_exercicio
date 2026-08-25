package concatenacaoexerciciopg38;

import java.util.Scanner;

public class exercico10 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

                             double numero = 0;
                             int quantidadesnotas = 0;

          System.out.println("digite a primeira nota: ");
            numero += Double.parseDouble(scanner.nextLine());
            quantidadesnotas++;

        System.out.println("digite a segunda nota: ");
            numero += Double.parseDouble(scanner.nextLine());
            quantidadesnotas++;

        System.out.println("digite a terceira nota: ");
            numero += Double.parseDouble(scanner.nextLine());
            quantidadesnotas++;

        System.out.println("digite a quarta nota: ");
            numero += Double.parseDouble(scanner.nextLine());
            quantidadesnotas++;



double media = quantidadesnotas / numero;

System.out.printf("a quantidades de notas %d fica em media de %.2f%n ", quantidadesnotas, numero);




scanner.close();






    }
}
