package exercicios;

import java.util.ArrayList;
import java.util.List;

public class listaQuaiMaioresQue10 {
public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<>(List.of(1, 2, 33, 42, 3, 14, 23, 90));
//      criamos uma lista com números aleatórios.

        int contador = 0;
//      criamos uma variável int para que a contagem de partes vá direto para ela.


        for (int i = 0; i < numeros.size(); i++ ) {
//      entramos com um for para verificar a lista com os números com a sua magia de repetição.

        if ( numeros.get(i) > 10 ){
            contador++;
//      Criamos esse metodo com o if para que toda vez que o for encontrar o número maior que 10 ele adcione 1 a variável que está vazia.
        }

        }
        System.out.println("O número total de maiores que 10 são: " + contador);
//      Depois puxamos essa variável e apresentamos o resultado.

}
}
