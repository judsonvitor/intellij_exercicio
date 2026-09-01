package operadoresLogicosExercicio;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite seu peso: ");
        double peso = Double.parseDouble(scanner.nextLine());




        boolean aprovado = (idade >= 18 && idade <=65 ) && (peso >=50.00);


        System.out.println(aprovado);


scanner.close();
    }
}
