///
package tiposDeMetodosExercicio;

import java.util.Scanner;

class exercicioo13 {

        static int lerDados() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite sua idade: ");
            int idade = Integer.parseInt(scanner.nextLine());
            return idade;
        }

        static boolean processar(int idade) {
            if (idade >= 18) {
                return true;
            } else {
                return false;
            }
        }

    static void apresentaDados(boolean resultado) {
    if (resultado) {
        System.out.println("Voce é maior de idade.");
    } else {
        System.out.println("Você é menor de idade");
    }


    }

    public static void main() {
        int idadeinformada = lerDados();
        boolean ehmaiordeidade = processar(idadeinformada);
        apresentaDados(ehmaiordeidade);
    }
}