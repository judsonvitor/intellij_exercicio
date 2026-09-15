package tiposDeMetodosExercicio;

import java.util.Scanner;

public class exercicio5 {
    static double calcularparcelas(double valortotal, int parcela) {
        return valortotal / parcela;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor total da compra: ");
        double compra = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o valor de parcelas: ");
        int parcelas = Integer.parseInt(scanner.nextLine());


        double parcelas2 = calcularparcelas(compra, parcelas);

        System.out.printf("Valor de cada parcela : %.2f ", parcelas2);

        scanner.close();
    }
}
