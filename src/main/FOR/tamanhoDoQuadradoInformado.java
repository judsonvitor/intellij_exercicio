import java.util.Scanner;

public class tamanhoDoQuadradoInformado {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


    System.out.println("Informe o tamanho do quadrado:");
    int quadrado = Integer.parseInt(scanner.nextLine());


    for (int i = 1; i <= quadrado; i++) {

        for (int j = 1; j <= quadrado; j++) {
        System.out.print("* ");
        }
        System.out.println();
    }

    }
}
