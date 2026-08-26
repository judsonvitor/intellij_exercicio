package operadoresLogicosExercicio;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o usuario: ");
        String user = scanner.nextLine();


        System.out.println("Digite a semha: ");
        String senha = scanner.nextLine();


        boolean acessoahprovado =  (user.equals("admin") && senha.equals("1234"));

        System.out.println("acesso concedido?: " + acessoahprovado);




        scanner.close();
    }
}
