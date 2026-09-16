package tiposDeMetodosExercicio;

import java.util.Scanner;

public class exercicio6 {
    public static double mediaDeDuas( double nota1, double nota2){
        return (nota1 + nota2 ) / 2;
    }
    public static double MediaDeTres(double nota1, double nota2, double nota3){
        return (nota1 + nota2 + nota3) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você quer calcular a media de quantas notas? (2 ou 3).");
        int quantidade = Integer.parseInt(scanner.nextLine());

        if (quantidade == 2) {
            System.out.printf("Digite a primeira nota %nEX: 8.00%n://");
            double nota1 = Double.parseDouble(scanner.nextLine());

            System.out.println("Digite a segunda nota: ");
            double nota2 = Double.parseDouble(scanner.nextLine());


            double calcularmedia = mediaDeDuas(nota1, nota2);
            System.out.printf("A media das duas notas é: %.2f", calcularmedia);
        }

        else if (quantidade == 3) {
            System.out.printf("Digite a primeira nota %nEX: 8.00%n:");
            double nota1 = Double.parseDouble(scanner.nextLine());

            System.out.println("Digite a segunda nota: ");
            double nota2 = Double.parseDouble(scanner.nextLine());

            System.out.println("Digite a terceira nota: ");
            double nota3 = Double.parseDouble(scanner.nextLine());


            double calcularAsTres = MediaDeTres(nota1, nota2, nota3);
            System.out.printf("A media das três notas é: %.2f", calcularAsTres);

        }


        scanner.close();
    }
}
