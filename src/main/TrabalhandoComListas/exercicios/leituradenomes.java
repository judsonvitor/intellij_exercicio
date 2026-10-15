package exercicios;

import java.util.List;
import java.util.Scanner;

public class leituradenomes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = List.of("Ana", "Marcos", "Pedro", "Vitor");

        System.out.println("Agora digite o nome para fazer a pesquisa");
        String pesquisa = scanner.nextLine();

        for (int i = 0; i < nomes.size(); i++){
            if (nomes.get(i).equalsIgnoreCase(pesquisa)) {
                System.out.println("O nome foi encontrado na lista.");
                return;

            }
        }


        System.out.println("O nome não foi encontrado na lista.");



scanner.close();
    }
}
