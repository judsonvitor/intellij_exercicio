package desvioDeFluxoTeoria;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite seu salário: ");
        double salario = Double.parseDouble(scanner.nextLine());

double valor = salario;


        if (salario <= 2000) {
            System.out.println("Seu salário não possuí imposto de renda");
        } else if (salario <= 5000) {
            double imposto = valor * 0.10;
            valor -= imposto;

            System.out.println("Seu salário possuí imposto de até 10%! ");
            System.out.println("Desconto com imposto é: " + imposto);
            System.out.println("O valor líquido fica: " + valor);

        } else if (salario >=5000) {
            double imposto = valor * 0.20;
            valor -= imposto;

            System.out.println("Seu salário é acima de 5000, então possuí imposto de 20%!");
            System.out.println("o total do imposto é de:  " + imposto);
            System.out.println("Valor líquido fica: " + valor);
        }



        scanner.close();
    }
}
