package DesvioDeFluxoSWITCHcase;

import java.text.Normalizer;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("FRUTAS ////");
        System.out.println( "Morango.");
        System.out.println("Maçã.");
        System.out.println("Banana.");
        System.out.println("Melão.");


        System.out.print("\nQual fruta você quer? \n ");
        String fruta = scanner.nextLine().strip().toLowerCase();




        fruta = Normalizer.normalize(fruta, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "");

        switch (fruta) {
            case "maca" -> System.out.println("Preço: R$ 4,50 por kg");
            case "banana" -> System.out.println("Preço: R$ 2,40 por kg");
            case "melao" -> System.out.println("Preço: R$ 3,40 por kg");
                case "morango" -> System.out.println("Preço: R$ 90.00 por kg  (é muito bom)");
            default -> System.out.println("Fruta não cadastrada.");
        }





scanner.close();
    }
}
