import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class apenasDivisores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeroListaDisvisor = new ArrayList<>();


        System.out.println("Digite o primeiro número: ");
        int numeroParaLIsta = Integer.parseInt(scanner.nextLine());
        numeroListaDisvisor.add(numeroParaLIsta);

       for (int calculo : numeroListaDisvisor) {
           System.out.println("Divisores de " + calculo + " >>>>>");


           for (int i = 0; i < calculo; i ++){
               if (calculo %i == 0) {
                   System.out.println(i);
               }

           }




       }

            scanner.close();
        }
    }

