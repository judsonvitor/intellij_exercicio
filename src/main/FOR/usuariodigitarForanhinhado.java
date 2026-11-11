import java.util.Scanner;

public class usuariodigitarForanhinhado {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

    System.out.println("Quantas linhas você quer? ");
    int linhas = Integer.parseInt(scanner.nextLine());


    System.out.println("Quantas colunas você quer? ");
    int colunas = Integer.parseInt(scanner.nextLine());


for (int i = 1 ; i <= linhas; i++) {
    for (int j = 1 ; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
 scanner.close();   }

}
