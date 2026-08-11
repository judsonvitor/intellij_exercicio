package ProjetosExercicio;

import java.util.Scanner;

public class quantidadesCanetas {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("digite o preço da caneta");
    double preço = Double.parseDouble(scanner.nextLine());


    System.out.println("digite a quantidades de caneta.");
    double quantidade = Double.parseDouble(scanner.nextLine());

    double total = preço * quantidade;



    System.out.println("Total: \n" + total);

    scanner.close();



}

}
