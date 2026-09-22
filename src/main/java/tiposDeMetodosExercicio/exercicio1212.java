package tiposDeMetodosExercicio;

import java.util.Scanner;

///
public class exercicio1212 {
    static boolean validarSenha(String senha) {
        if (senha.length() >= 5)
            System.out.println("Acesso liberado");

        else if (senha.length() > 5) {
            System.out.println("Acesso total negado.");

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite a senha com letras: \nEXEMPLO: computador\n");
        String senha = scanner.nextLine();



        validarSenha(senha);

        scanner.close();
    }
}
