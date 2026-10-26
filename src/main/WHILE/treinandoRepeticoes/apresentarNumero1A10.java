package treinandoRepeticoes;

import java.util.Scanner;

public class apresentarNumero1A10 {
    public static void main(String[] args){

        int contador = 10;

        System.out.println("Iniciando contagem regressiva.");


        while (contador >= 1) {
            System.out.println("A contagem está em: " + contador);
            contador--;
        }


    }
}
