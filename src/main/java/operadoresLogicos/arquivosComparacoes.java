package operadoresLogicos;

import java.util.Scanner;

public class arquivosComparacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();


        System.out.println("Digite sua idade: ");
        int idade = Integer.parseInt(scanner.nextLine());


        System.out.println("Digite seu saldo");
        double saldo = Double.parseDouble(scanner.nextLine());


                            boolean maiorDeIdade = idade >= 18;
                            boolean temSaldo = saldo > 0;
                            boolean aprovado = maiorDeIdade && temSaldo;
                            boolean ehadministrador = nome.equalsIgnoreCase("admin");


                            System.out.printf("Maior de idade: " + maiorDeIdade);
                            System.out.printf("%nTem saldo: " + temSaldo);
                            System.out.printf("%nAprovado: " + aprovado);
                            System.out.printf("%nÉ admnistrador : " + ehadministrador);
                            System.out.printf("%nNão é aprovado: " + !aprovado);


        scanner.close();
    }
}
