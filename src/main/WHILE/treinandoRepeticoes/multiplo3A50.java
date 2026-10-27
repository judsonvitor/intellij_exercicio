package treinandoRepeticoes;

import java.util.Scanner;

public class multiplo3A50 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int multiplo = 0;


        while (multiplo < 50){
            multiplo = multiplo + 3;
            System.out.println(multiplo);
        }



        scanner.close();
    }
}
