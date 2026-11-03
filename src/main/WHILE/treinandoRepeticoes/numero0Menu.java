package treinandoRepeticoes;

import java.util.Scanner;

public class numero0Menu {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
int opcao;
do {
    System.out.println("""
            =====MENU=====
            0- sair
            1- arroz
            2- feijão
            3- panetone
            
            """);
    opcao = Integer.parseInt(scanner.nextLine());
    System.out.println("R:");
    switch (opcao) {
        case 1-> System.out.println("Adcionando arroz ao cardápio...");
        case 2-> System.out.println("Adcionando feijão ao cardápio...");
        case 3-> System.out.println("Adcionando panetone ao cardápio...");
    }
} while (opcao!=0); {
            System.out.println("Fechando...");

        }


















    }
}
