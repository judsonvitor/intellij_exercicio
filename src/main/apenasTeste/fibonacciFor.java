public class fibonacciFor {
    public static void main(String[] args){

        int anterior = 0;
        int atual = 1;

        for (int i = 1; i <= 1000; i++){
            System.out.println(anterior + " ");
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

    }
}
