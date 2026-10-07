package praticando;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NovosConceitos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<String> compras = new ArrayList<>();

        System.out.println("Digite 3 produtos.");
        compras.add(scanner.nextLine());
        compras.add(scanner.nextLine());
        compras.add(scanner.nextLine());

        System.out.println("-----LISTA DE COMPRAS-----");
        for (int i = 0; i < compras.size(); i++) {
            System.out.println((i + 1) + " - " + compras.get(i));
        }

        System.out.println("Total de itens: " + compras.size());
        System.out.println("Primeiro item: " + compras.get(0));
        System.out.println("Último item: " + compras.get(compras.size() - 1));


        Collections.sort(compras);
    System.out.println("Em ordem alfabética: " + compras);

        compras.remove(0);
    System.out.println("Após remover o primeiro: " + compras);

        System.out.println("Contém 'Arroz'? " + compras.contains("Arroz"));


        scanner.close();
    }
}
