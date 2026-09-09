package DesvioDeFluxoSWITCHcase;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Me diga seu sexo como M ou F");
        String sexo = scanner.nextLine();

        switch (sexo){
            case "M" -> System.out.println("Você possuí o sexo Masculino!!!");
            case "m" -> System.out.println("Você possuí o sexo Masculino!!!");
            case "F" -> System.out.println("Você possuí o sexo Feminino!!!");
            case "f" -> System.out.println("Você possuí o sexo Feminino!!!");
            default -> System.out.println("As letras não correspondem");
        }


        scanner.close();
    }
}
