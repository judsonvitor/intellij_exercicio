package praticando;

import java.util.List;

public class exercicio2 {
    public static void main(String[] args){
        List<Integer> numeros = List.of(10, 35, 23, 34);


        int soma = 0;

        for (int numero : numeros){
            soma += numero;
        }

        System.out.println("Soma : " + soma);



    }
}
