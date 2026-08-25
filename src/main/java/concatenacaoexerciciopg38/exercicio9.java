package concatenacaoexerciciopg38;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;

        System.out.println("Digite o número com número inteiro: ");
        numero += Integer.parseInt(scanner.nextLine());



        numero *= 2;


        System.out.printf("do dobro do número ficou: %d%n",numero );





scanner.close();
    }
}
