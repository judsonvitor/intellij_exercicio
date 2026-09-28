package Parte2LeituraDeDados;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual nome da sua rua: ");
        String rua = scanner.nextLine();


        System.out.println("Digite o número de sua residência: ");
        int residencia = Integer.parseInt(scanner.nextLine());


        System.out.println("Digite o nome do seu bairro: ");
        String bairro = scanner.nextLine();


        System.out.println("Digite o nome da sua cidade: ");
        String cidade = scanner.nextLine();


        System.out.println("E por ultimo, digite o cep de onde você mora. (sem traços)");
        int cep = Integer.parseInt(scanner.nextLine());


        System.out.println("Nome da rua: "+ rua + "\nNúmero da residência: "+residencia+ "\nBairro: "+ bairro+ "\nCidade: "+cidade+"\nCEP: "+cep );


        scanner.close();

    }
}
