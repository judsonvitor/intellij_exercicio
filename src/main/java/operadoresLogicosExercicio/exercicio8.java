package operadoresLogicosExercicio;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("qual foi sua nota?: ");
        double nota = Double.parseDouble(scanner.nextLine());

         boolean soma = !(nota <=0 && 0>=10);


        System.out.println("a nota fica entre 0 e 10?: " + soma);



        scanner.close();

    }
}
