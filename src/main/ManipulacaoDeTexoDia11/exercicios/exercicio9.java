package exercicios;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite algo.");
        String palavra = scanner.nextLine();


        if (!palavra.isEmpty()) {
            String maiscula = palavra.substring(0, 1).toUpperCase();

            String restantemaiscula = palavra.substring(1).toLowerCase();

            String uniao = maiscula + restantemaiscula;


            System.out.println("Texto corrigido: " + uniao);

        } else {
            System.out.println("Nenhum texto detectado.");


            scanner.close();
        }
    }
}
