package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class apresentacaoDeNomesSomenteLetraA {
    public static void main(String[] args){
        ArrayList<String> nome = new ArrayList<>(List.of("Maria", "Borges"));



        for (int i = 0; i < nome.size(); i ++){
            if (nome.get(i).toLowerCase().contains("a")) {
                System.out.println(nome.get(i));
            }
        }





    }
}
