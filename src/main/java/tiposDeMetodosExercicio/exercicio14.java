package tiposDeMetodosExercicio;

import java.util.Scanner;

public class exercicio14 {
    static double calculoDaViagem(double distancia, double precoDoConbustivel, double consumo){
      return (distancia / consumo) * precoDoConbustivel;
    }

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distância que você percorreu, não prcisa colocar 'KM'.");
        double distancia = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o preço do conbustível: ");
        double precoDoConbustivel = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o consumo do seu carro:");
        double consumo = Double.parseDouble(scanner.nextLine());





        double chamar = calculoDaViagem(distancia, precoDoConbustivel,consumo);

        System.out.printf("O custo total dessa viagem fica: %.2f", chamar);



scanner.close();
}
}