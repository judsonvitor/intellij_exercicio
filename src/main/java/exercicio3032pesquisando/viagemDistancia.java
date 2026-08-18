package exercicio3032pesquisando;

import java.util.Scanner;

public class viagemDistancia {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);


        System.out.println("digite quantos km você andou apenas com numeros: ");
        double distancia = Double.parseDouble(scanner.nextLine());


        System.out.println("digite o preço do litro: ");
        double preco = Double.parseDouble(scanner.nextLine());


        System.out.println("digite quantos km seu carro faz por litro apenas com numeros: ");
        double consumo = Double.parseDouble(scanner.nextLine());



        double calculo = (distancia / consumo) * preco;


        System.out.printf("custo total do conbusivel: %.2f%n", calculo);



        scanner.close();











    }

}
