package exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class splitCriarLista {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite uma frase: ");
        String fraseParaParte = scanner.nextLine();

        ArrayList<String> nomesPartes = new ArrayList<>(Arrays.asList(fraseParaParte.split(" j")));


        int quantidade = nomesPartes.size();
        System.out.println("A quantidade de palavras é de: " + quantidade);


scanner.close();
    }
}
