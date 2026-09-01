package operadoresLogicosExercicio;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano que você nasceu e eu digo se é bissexto: ");
        int ano = Integer.parseInt(scanner.nextLine());

        boolean bissexto = (ano %4 == 0 && ano % 100 != 0) || (ano % 400 ==0);

        System.out.println("o ano é bissexto?: "+ bissexto);


        scanner.close();










    }
}
