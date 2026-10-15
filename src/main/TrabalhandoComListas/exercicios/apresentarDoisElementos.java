package exercicios;

import java.util.ArrayList;
import java.util.List;

public class apresentarDoisElementos {
    public static void main(String[] args){
        List<String> dados1 = new ArrayList<>();
        List<String> dados2 = new ArrayList<>();
        List<String> dados3 = new ArrayList<>();

//  Criei 3 arraylist sem dados fixos, pois eu iria adcionar com o .add logo em seguida.
        dados1.add("joao");
        dados1.add("maria");
        dados1.add("jose");
        dados1.add("ronaldo");
        dados1.add("reginaldo");
        dados2.add("raimundo");
        dados2.add("reitor");
        dados2.add("ratatuie");
        dados2.add("mariah");
        dados2.add("vitor");
        dados2.add("marcondes");
//  Aqui eu adcionei os dados na arraylist, tanto os dados1 quanto os dados2.

        dados3.addAll(dados1);
        dados3.addAll(dados2);
        dados3.remove("vitor");
        dados3.remove(4);
//  Aqui eu adcionei os dados1 e dados2 dentro dos dados3.
//  Também fiz umas remoção em forma de ir alterando os dados.


        System.out.println("-----Os dados seguintes são-----");


        for (int i = 0; i < dados3.size(); i++){
            System.out.println((i + 1) + "-" + dados3.get(i));
        }

//  Após tudo isso o for irá ver os conteudos dos dados3 e irá verificar quamtas partes tem com a ajuda do .size e irá imprimir de acordo com a quantidade.




    }
}
