package Teste;

import java.util.Locale;

public class Teste01 {

    public static void main(String[] args) {

        double x = 10.35784;
        String nome = "maria";
        int idade = 31;
        double renda = 17.4807;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        System.out.println("Resultado = " + x + " Metros");
        System.out.printf("RESULTADO = %.2f Metros%n", x);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}
