package DesvioDeFluxoSWITCHcase;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o primeiro número onde qual o mesmo deseja fazer a soma.");
        int a = Integer.parseInt(scanner.nextLine());


        System.out.println("Digite qual operador deseja usar: /, *, -, +.");
        String operador = scanner.nextLine();


        System.out.println("Digite o segundo número que você deseja fazer a soma pelo primeiro.");
        int b = Integer.parseInt(scanner.nextLine());



        switch (operador) {
            case "+" -> System.out.printf("a soma de ambos é: %d", a + b);
            case "-" -> System.out.printf("a soma de ambos é: %d ", a - b);
            case "*" -> System.out.printf("a soma de ambos é: %d ", a * b);
            case "/" -> {
                if (b == 0) {
                    System.out.printf("o elemento ", b, " não pode ser dividido pelo elemento ", a);
                } else {
                    System.out.printf("a divisão fica: %d ", a / b);
                }
            }
                default -> System.out.println("Operador inválido.");

                }
            }
        }