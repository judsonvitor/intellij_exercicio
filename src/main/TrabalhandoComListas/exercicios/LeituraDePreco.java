package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class LeituraDePreco {
    public static void main(String[] args){
        ArrayList<Double> preco = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);



        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o preço dos 5 produtos: ");
            double leitura = Double.parseDouble(scanner.nextLine());
            preco.add(leitura);
        }


        System.out.println("-----LISTA-----");

       for (int i = 0; i < preco.size(); i++) {
           System.out.println((i + 1) + " - " + preco.get(i));

       }





    }

}
