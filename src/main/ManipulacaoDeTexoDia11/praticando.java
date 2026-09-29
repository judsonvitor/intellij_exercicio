import java.util.Scanner;

public class praticando {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


    String data = "02/09/2026";
    String[] partes= data.split("/");

        System.out.println("Dia: " + partes [0]);
        System.out.println("Mês: " + partes [1]);
        System.out.println("Ano: " + partes [2]);







        scanner.close();
    }
}
