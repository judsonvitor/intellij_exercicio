package tiposDeMetodosExercicio;

import java.util.Scanner;

public class exercicio4 {
    static boolean ehmaiordeidade(int idade){
        return idade >=18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.println("Digite sua idade: ");
    int idade = Integer.parseInt(scanner.nextLine());


    if (ehmaiordeidade(idade)) {
        System.out.println("você é maior de idade.");
    } else {
        System.out.println("Você é menor de idade.");
    }

















    }












}
