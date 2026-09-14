package TiposDeMetodos;

public class praticando4 {
    static int maiorDeTres(int a, int b, int c) {
        int maior = a;

        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }
        return maior;

    }

    public static void main(String[] args) {
        System.out.println(maiorDeTres(10, 45, 32));
        System.out.println(maiorDeTres(80, 12, 7));
    }
}