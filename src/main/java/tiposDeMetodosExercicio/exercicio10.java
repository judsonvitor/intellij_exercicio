package tiposDeMetodosExercicio;

import java.util.Scanner;

public class exercicio10 {
    public static void maiordetres(int numero1, int numero2, int numero3){
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("O número 1 é maior do que os demais.");

        } else if (numero2 > numero1 && numero2 > numero3){
            System.out.println("o segundo número é maior que os demais.");

        } else if ( numero3 > numero1 && numero3 > numero2){
            System.out.println("O me ensterceiro número citado é maior que os demais.");
        }


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número para ter certeza qual é maior que os demais.");
        int numero1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o segundo número: ");
        int numero2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o terceiro número: ");
        int numero3 = Integer.parseInt(scanner.nextLine());


        maiordetres(numero1, numero2, numero3 );


scanner.close();
    }
}
