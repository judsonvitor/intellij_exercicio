package treinandoRepeticoes;

import java.util.Scanner;

public class usuarioDigitandonotas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


    double nota = 0;
    double somanotas = 0;
    int quantidadeDeNotasoma = 0;

    while (nota !=-1) {
        System.out.println("Digite suas notas ou -1 para sair.");
       nota = Integer.parseInt(scanner.nextLine());

        if (nota !=-1) {
            nota = nota + somanotas;
            quantidadeDeNotasoma++;
        }
    }

double soma = somanotas / quantidadeDeNotasoma;
System.out.println("A sua nota final ficou de: " + soma);


        scanner.close();
    }
}
