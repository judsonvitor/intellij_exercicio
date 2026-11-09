public class exibicao1A20 {
    public static void main(String[] args){

        int numero = 1;
        int conta = 1;

        for (int i = 1; i <= 20; i++) {
            System.out.println(conta);
            int conta1a1 = conta + numero;
            conta = conta1a1;
        }
    }
}
