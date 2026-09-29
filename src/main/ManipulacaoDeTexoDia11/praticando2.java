import java.util.Scanner;

public class praticando2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome completo. ");
        String nome = scanner.nextLine().strip();

        String nomecompleto = nome.split(" ") [0];

        System.out.println("Primeiro nome: " + nomecompleto);




        scanner.close( );
    }
}
