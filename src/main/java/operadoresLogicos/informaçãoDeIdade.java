package operadoresLogicos;

import java.util.Scanner;

public class informaçãoDeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite a sua idade: ");
        int idade = Integer.parseInt(scanner.nextLine());


        System.out.println("Digite seu saldo: ");
        double saldo = Double.parseDouble(scanner.nextLine());


                            boolean aprovado = idade >= 18 && saldo >= 1.000;


    System.out.println("aprovado: " + aprovado);


    scanner.close();
    }
}
