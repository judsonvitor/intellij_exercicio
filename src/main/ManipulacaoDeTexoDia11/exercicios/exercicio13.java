package exercicios;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        String menu = """
                ======================
                         MENU
                ======================
                
                1 - SAIR
                
                2 - ENTRAR
                
                3 - CONFIGURAÇÕES
                
                =====================
                """;

        System.out.println(menu);
        scanner.close();
    }
}
