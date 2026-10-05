package exercicios;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu cep. Ex: 89057-301");
        String cep = scanner.nextLine();

        String cepLimpo = cep.replace("-", "");


        System.out.println("O cep ficou: " + cepLimpo);

    scanner.close();
    }
}
