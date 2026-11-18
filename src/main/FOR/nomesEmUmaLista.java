import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class nomesEmUmaLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> bancoDeNomes = new ArrayList<>();

        System.out.println("Digite 5 nomes para incluir ao banco de dados.\n");



    for (int i = 0; i <= 4; i++) {
        System.out.println("Digite o " + (i + 1) + "º nome para cadastrar:");
        String nomeparaobanco = scanner.nextLine();
        bancoDeNomes.add(nomeparaobanco);

        }

    String maiornome = bancoDeNomes.get(0);

    for (int i = 0; i < bancoDeNomes.size(); i++) {
        String nnomeautual = bancoDeNomes.get(i);

        if (nnomeautual.length() > maiornome.length()) {
            maiornome = nnomeautual;
        }
    }

        System.out.println("O nome maior é o " + maiornome);
    }

}
