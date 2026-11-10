import java.util.ArrayList;
import java.util.List;

public class nomeaolado {
    public static void main(String[] args){
        ArrayList<String> nomesDados = new ArrayList<>(List.of("Maria", "João"));

        System.out.println("=======================");
        for (int i = 0; i < nomesDados.size(); i++ ){
            System.out.println((i + 1) + "-" + nomesDados.get(i));
        }

        System.out.println("=======================");
    }

}
