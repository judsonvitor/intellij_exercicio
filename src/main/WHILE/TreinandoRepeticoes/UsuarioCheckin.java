package TreinandoRepeticoes;

import java.util.Scanner;

public class UsuarioCheckin {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        String senha;
        int tentativas = 0;

        do {
            System.out.println("Digite a senha: ");
            senha = scanner.nextLine();
            tentativas++;

            if (!senha.equals("1234")) {
                System.out.println("Senha incorreta. tente novamente");
            }
        } while (!senha.equals("1234"));
        System.out.println("Acesso liberado em " + tentativas + " tentativas");

    }


  }

