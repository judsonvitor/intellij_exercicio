package exercicios;

import java.awt.font.FontRenderContext;
import java.util.ArrayList;
import java.util.Scanner;

public class LeituraDe3Produtos {
    public static void main(String[] args){
        ArrayList<String> produtos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        for ( int i = 0; i < 3; ++i) {
            System.out.println("Digite 3 produtos: ");
            String produto = scanner.nextLine();
            produtos.add(produto);
        }

        System.out.println("---------LISTA---------");

        for (int i = 0; i <produtos.size(); i++){
            System.out.println((i + 1) + " - " + produtos.get(i));
        }









scanner.close();
    }
}
