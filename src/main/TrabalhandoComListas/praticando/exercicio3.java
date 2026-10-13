package praticando;

import java.util.List;

public class exercicio3 {
    public static void main(String[] args){
        List<Integer> numeros = List.of(10, 20, 30, 40, 50);

        int maior = numeros.get(0);
        int menor = numeros.get(0);


        for (int numero : numeros ){
            if (numero > maior){
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

    }
}
