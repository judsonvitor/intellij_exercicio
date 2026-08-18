package exercicio3032pesquisando;

import java.util.Scanner;

public class quatroCasasDecimais {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("digite um numero de 3 digitos: ");
        double numero1 = Double.parseDouble(scanner.nextLine());

        System.out.println("digite o segundo numero com 3 digitos: ");
        double numero2 = Double.parseDouble(scanner.nextLine());


        double calculo = numero1 / numero2;


        System.out.printf("o valor do numero com 4 casas decimais fica: %.4f%n", calculo);

scanner.close();



    }
}
