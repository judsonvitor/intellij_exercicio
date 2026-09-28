package Parte2LeituraDeDados;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o nome do aluno: ");
        String aluno = scanner.nextLine();

        System.out.println("Digite a matrícula: ");
        int matricula = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite o nome do curso: ");
        String curso = scanner.nextLine();

        System.out.println("Digite o semestre atual: ");
        int semestre = Integer.parseInt(scanner.nextLine());


        System.out.println("Nome do aluno: " + aluno + "\nMatrícula: "+ matricula+ "\nNome do curso: " + curso + "\nsemestre: "+ semestre);
        scanner.close();


    }
}
