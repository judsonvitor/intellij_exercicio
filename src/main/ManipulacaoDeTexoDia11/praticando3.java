import java.util.Scanner;

public class praticando3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite seu email: ");
        String email = scanner.nextLine().strip().toLowerCase();



    boolean valido = email.contains("@") && email.contains(".") && email.length() > 5;


    if (valido) {
        System.out.println("E-mail válido.");
    } else {
        System.out.println("E-mail inválido.");



scanner.close();
    }
}
}

