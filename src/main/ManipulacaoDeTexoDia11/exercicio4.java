import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um texto.");
        String reverso = scanner.nextLine();

        String reverseTexto = new StringBuilder(reverso).reverse().toString();


        System.out.println("No modo invertido fica: " + reverseTexto);





        scanner.close();
    }
}
