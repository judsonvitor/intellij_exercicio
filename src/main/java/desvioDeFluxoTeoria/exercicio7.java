package desvioDeFluxoTeoria;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o comprimento do lado A.");
        double ladoa = Double.parseDouble(scanner.nextLine());

        System.out.println("Agora o comprimento do lado B.");
        double ladob = Double.parseDouble(scanner.nextLine());

        System.out.println("Por fim o ultimo lado sendo ele C.");
        double ladoc = Double.parseDouble(scanner.nextLine());


    if  (ladoa < (ladob + ladoc) && ladob < (ladoc + ladoa) && ladoc < (ladoa +ladob)) {
        System.out.println("É um triângbulo!!");

        } else {
        System.out.println("não é um triângulo!");
        System.out.println("Regra violada: os lado são maior ou igual aos demais." );

    }






scanner.close();

    }
}
