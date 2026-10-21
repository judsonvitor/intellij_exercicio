package TreinandoRepeticoes;

import java.util.Scanner;

public class usuarioEscolherLista {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        int opcao;

        do {
            System.out.println("==========================================");
            System.out.println("               MENU PRINCIPAL             ");
            System.out.println("==========================================");
            System.out.println(" 1 ---- Cosulta de saldo.");
            System.out.println(" 2 ---- Depositar.");
            System.out.println(" 3 ---- Sacar.");
            System.out.println(" 0 ---- sair.");
            System.out.print(" Escolha uma opção.\n");


            opcao = Integer.parseInt(scanner.nextLine());


         switch (opcao) {
            case 1 -> System.out.println("O seu saldo é de: 32.234");
            case 2 -> System.out.println("Abrindo a tela...");
            case 3 -> System.out.println("Abrindo a tela de saque...");
            case 0 -> System.out.println("saindo da tela...");
            default -> System.out.println("Opção inválida.");
        }
            System.out.println();
      }while (opcao !=0);

        scanner.close();
   }
}
