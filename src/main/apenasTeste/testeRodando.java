import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testeRodando {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();


    System.out.println("Quantas notas você quer cadastrar?");
    int quantidade = Integer.parseInt(scanner.nextLine());


    for (int i = 1; i <= quantidade; i++) {
        System.out.println("Digite a nota " + i + ":");
        notas.add(Double.parseDouble(scanner.nextLine()));
    }

    double soma = 0;
    for (double nota : notas) {
        soma += nota;
    }

        System.out.println("----notas cadastradas-----");
    for (int i = 0; i < notas.size(); i++){
        System.out.printf("%dª nota: %.2f%n", (i + 1), notas.get(i));
    }
    double media = soma / notas.size();
    System.out.printf("Média: %.2f%n", media);

    int acimadamedia = 0;
    for (double nota : notas) {
        if (nota > media) {
            acimadamedia++;
        }
    }
        System.out.println("Notas acima da media: " + acimadamedia);

        scanner.close();
    }
}
