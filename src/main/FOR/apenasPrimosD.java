import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class apenasPrimosD {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);{

            int contador = 0;



            System.out.println("Digite um numero: ");
            int numero = Integer.parseInt(scanner.nextLine());


            for (int i = 1; i <= numero; i++) {
               if (numero %i == 0) {
                   contador++;

                }
            }
            if (contador == 2) {
            System.out.println("O numero " + numero+ " é primo" );
            } else {
                System.out.println("O número " + numero + " não é primo");
            }







            scanner.close();
        }
    }
}
