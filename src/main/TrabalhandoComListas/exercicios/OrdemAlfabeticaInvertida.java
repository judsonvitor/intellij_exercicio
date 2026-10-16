package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdemAlfabeticaInvertida {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nomesinverso = new ArrayList<>();


        System.out.println("Digite 5 nomes para ver a ordem inversa.");


        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + ( i + 1 ) + "°nome.");
            String nome = scanner.nextLine();
            nomesinverso.add(nome);

        }
        Collections.reverse(nomesinverso);

        System.out.println("-----NOME EM ORDEM INVERSA-----");
        for (int i = 0; i < nomesinverso.size(); i++){
            System.out.println((i + 1) + " - " + nomesinverso.get(i));

        }

scanner.close();
    }
}
