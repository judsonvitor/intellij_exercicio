package TreinandoRepeticoes;

import java.util.Scanner;

public class lista {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int opcao;


        do {
            System.out.println("01 - Cadastrar");
            System.out.println("02 - Listar");
            System.out.println("03 - Sair");
            System.out.println("Escolha uma opção:");

            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case  1 -> System.out.println("Cadastrando...");
                case  2 -> System.out.println("Listando...");
                case  3 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida...");
            }
        } while (opcao != 0);
    }
}
