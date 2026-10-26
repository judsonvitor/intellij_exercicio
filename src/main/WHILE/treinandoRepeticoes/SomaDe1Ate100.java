package treinandoRepeticoes;

public class SomaDe1Ate100 {
    public static void main(String[] args){
        int contador = 1;

        int somaTotal = 0;


        System.out.println("calculando os números de 1 a 100");

        while (contador <= 100) {

            somaTotal = somaTotal + contador;

            contador++;
        }

        System.out.println("O resultado fica de: " + somaTotal);



    }
}
