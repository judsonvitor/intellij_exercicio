package treinandoRepeticoes;

import java.util.Scanner;

public class simuladorDeCaixa {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

int QuantidadeNoCarrinho = 0;

double valorfinal = 0;

        System.out.println("Digite o valor da compra ou 0 para sair");
        double valor = Double.parseDouble(scanner.nextLine());

while (valor !=0) {
    valorfinal += valor;
    QuantidadeNoCarrinho++;
    System.out.println("Digite o valor da compra ou 0 para sair");
    valor = Double.parseDouble(scanner.nextLine());
}
        System.out.printf("\uD83C\uDFC2O valor da compra ficou: %.2f " , valorfinal);
        System.out.println("Quantidade de produto: " + QuantidadeNoCarrinho);


        scanner.close();
    }
}
