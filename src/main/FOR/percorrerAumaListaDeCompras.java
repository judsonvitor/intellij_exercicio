import java.util.ArrayList;
import java.util.List;

public class percorrerAumaListaDeCompras {
    public static void main(String[] args){
        List<Double> dados = new ArrayList<>();
        List<String> nomes = new ArrayList<>(List.of("Feijão", "arroz", "Picanha"));

        dados.add(15.99);
        dados.add(20.50);
        dados.add(60.90);

    for (int i = 0; i < dados.size(); i++) {

        double precoantes = dados.get(i);

        double precodepois = precoantes * 0.90;

        System.out.println(nomes.get(i) + "Valor antes " + precoantes + " | " + precodepois);
    }












    }
}
