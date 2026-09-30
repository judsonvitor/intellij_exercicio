import java.util.Scanner;

public class praticando5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite seu nome completo:");
        String nome = scanner.nextLine();

        String[] palavras = nome.split(" ");
        String iniciais = "";



        for (String palavra : palavras) {
            if (!palavra.isBlank()) {
                iniciais += palavra.toUpperCase().charAt(0) + ".";

            }
        }

        System.out.println("Em letra maiscula fica: " + iniciais);



        scanner.close();
    }
}
