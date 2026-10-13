package praticando;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<String> produtos = new ArrayList<>();

        System.out.println("Digite os produtos (ou 'fim' para encerrar.");

        while (true) {
            String produto = scanner.nextLine().strip();

            if (produto.equalsIgnoreCase("fim")) {
                break;
            }

            produtos.add(produto);

        }

        System.out.println("------PRODUTOS CADASTRADOS------");
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println((i + 1) + " - " + produtos.get(i) );
        }

        System.out.println("Total: " + produtos.size() + " produto(s)");




        scanner.close();
    }
}
