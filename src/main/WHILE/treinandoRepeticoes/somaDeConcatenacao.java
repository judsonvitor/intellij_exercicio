package treinandoRepeticoes;

import java.util.Scanner;

public class somaDeConcatenacao {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int soma = -1;
        int concatencao = 0;

        while (soma != 0) {
           System.out.println("Digite:");
           soma = Integer.parseInt(scanner.nextLine());

           concatencao = concatencao + soma;
            System.out.println(concatencao);
        }



        scanner.close();
    }
}
