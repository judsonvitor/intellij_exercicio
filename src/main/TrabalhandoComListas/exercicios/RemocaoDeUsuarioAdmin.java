package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemocaoDeUsuarioAdmin {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> remocao = new ArrayList<>(List.of("Ana", "Rebeca", "Maria", "João"));
//  Comecei criando umas listas com nomes que eu mesmo adcionei para aparecer para o usuário.


        System.out.println("-----Lista de nome-----");
        for (int i = 0; i < remocao.size(); i++){
            System.out.println( i + " - " + remocao.get(i));
        }
//  Primeiro for serviu para fazer a coleta de dados. Ele serviu para amostrar para o usuário os nomes para assim a remoção ser feita.


        System.out.println("Remover algo da lista? Digite o numero que está ao lado esquerdo.");
        int numero = Integer.parseInt(scanner.nextLine());
//  Criamos uma variável int para os números que o número que o usuário digitar possa ser feita a remoção.


        String testeremocao = remocao.remove(numero);
//  Aqui foi feito uma variavel para jogar a remoção do número para a variável principal (remocao)


        System.out.println("-----LISTA APÓS REMOÇÃO-----");
        for (int i = 0; i < remocao.size(); i++) {
            System.out.println((i + 1) + " - " + remocao.get(i));
        }
//  Esse segundo for irá averiguar quais dados foram alterados e vê quaid partes ainda possuem e irá transmitir a mensagem de acordo com o seu delimitador .size


        scanner.close();
    }
}
