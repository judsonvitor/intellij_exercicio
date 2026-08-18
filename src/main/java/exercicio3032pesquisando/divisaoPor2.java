package exercicio3032pesquisando;

import java.util.Scanner;

public class divisaoPor2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("digite o primeiro valor:");
        double numero1 = Double.parseDouble(scanner.nextLine());


        System.out.println("digite o segundo numero: ");
        double numero2 = Double.parseDouble(scanner.nextLine());



        double calculo = (numero1 / numero2);


        System.out.println("o valor fica: " + calculo);


        scanner.close();









    }
}
