package TreinandoRepeticoes;

import java.util.Scanner;

public class arquivoSomatorio {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        double soma = 0;
        int quantidade = 0;
        Boolean continuar = true;


        while (continuar) {
            System.out.println("Digite um número ou 'fim' para encerrar: ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("fim")){
                continuar = false;

            } else {
                soma += Double.parseDouble(entrada);
                quantidade ++;
            }
        }
        System.out.println("Quantidade de números. " + quantidade);
        System.out.printf(" Soma: %.2f%n ", soma );


      if (quantidade > 0){

          System.out.printf("Média: %.2f%n ", soma / quantidade );

      } else {

          System.out.println("Nenhum número foi encontrado.");
      }








    }

}
