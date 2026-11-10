import java.util.ArrayList;
import java.util.List;

public class numero5media {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>(List.of(12, 23, 34, 12, 23));
        int acumulador = 0;


        System.out.println("-----Soma e media-----");
        for (int i = 0; i < lista.size(); i++) {

            acumulador = acumulador + lista.get(i);

        }
        double media = acumulador / lista.size();

        System.out.println("=======================");
        System.out.println("soma: " + acumulador);
        System.out.println("Média: " + media);




    }
}
