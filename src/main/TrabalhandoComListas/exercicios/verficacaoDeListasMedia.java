package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class verficacaoDeListasMedia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> usuarioNota = new ArrayList<>();

        System.out.println("Digite as suas ultimas 4 notas que teve: ");

        double soma = 0;

        for (int i = 0; i < 4; i ++) {
            System.out.println("...");
            double notasCadastradas = Double.parseDouble(scanner.nextLine());

            usuarioNota.add(notasCadastradas);

            soma += notasCadastradas;

        }
        double calculo = usuarioNota.size() / soma;
        System.out.println("A média final do aluno é de: " + calculo);


        scanner.close();
    }
}
