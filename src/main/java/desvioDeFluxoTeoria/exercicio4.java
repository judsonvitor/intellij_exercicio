package desvioDeFluxoTeoria;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua idade. ");
        int idade = Integer.parseInt(scanner.nextLine());

        System.out.println("Informe seu peso. ");
        double peso = Double.parseDouble(scanner.nextLine());



        if (idade >= 18 && idade <=65 && peso >= 65.00)
        {
            System.out.println("Você pode doar sangue!!!\uD83E\uDD73\uD83C\uDF89");
        } else {
            System.out.println("você não pode doar sangue.\uD83E\uDE79");
        }

scanner.close();




    }
}
