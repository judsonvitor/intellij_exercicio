package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdemAlfabeticaNomes {
    public static void main(String[] args){
        ArrayList<String> nomes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

            System.out.println("Digite 5 nomes par ordem alfabetia. ");

            for (int i = 0; i < 5; i++) {
//  O primeiro for foi para coletar os dados que foram digitados.

            System.out.println("Digite o " + (i + 1) + "ºnome: ");
            String nomescoleta = scanner.nextLine();
//  Depois pegamos a variável que o usuário digitou e jogamos ela nas array, como eu disse, foi para fazer a coleta de dados.
            nomes.add(nomescoleta);
        }
           Collections.sort(nomes);
//  Pegamos a variável principar e jogamos nesse metodo.

           System.out.println("-----NOMES EM ORDEM-----");


            for (int i = 0; i < nomes.size(); i++){
                System.out.println((i + 1) + " - " + nomes.get(i));
//  Esse for for para fazer a repetição do que está no println, ele faz a repetição de acordo com a numeracao do .size e transmite.
            }



          scanner.close();
     }
}
