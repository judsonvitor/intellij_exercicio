import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class apenasParDe10numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listaDeDados = new ArrayList<>();


        for (int i  = 0; i < 10; i++) {

        System.out.println("Digite o " + (i + 1) + "º" + "numero");

       int numeroParaOsDados = Integer.parseInt(scanner.nextLine());
       listaDeDados.add(numeroParaOsDados);

        }

        for (int numeroPar : listaDeDados ) {
          if (numeroPar % 2 == 0) {
              System.out.print("");
          } else {
              }


        }
        System.out.println("Lista de pares: ");

        System.out.println(listaDeDados);










scanner.close();
    }
}


