package exercicios;

import java.util.ArrayList;
import java.util.List;

public class nomeRemovido {
    public static void main(String[] args){
        List<String> nome = new ArrayList<>();
//  criamos um arraylist para colocar os dados.


          nome.add("maria");
          nome.add("joao");
          nome.add("cachorro");
          nome.add("pao");
          nome.add("maira");
          nome.add("marcos");
          nome.add("computador");
          nome.add("maça");
//  esse dados foram implementados dentro da array.

          nome.remove(1);
//  esse code faz que a parte numero 1 seja removida.


            System.out.println("-----------Lista após a remoção-----------");
//  Mensagem que irá aparecer independentemente se algo acontecer ou algum code quebrar.



            for (int i = 0; i < nome.size(); i++ ){
//  irá fazer a varredura e ver quais partes estão na lista com o comando .size e de acordo com a quantidade ele irá imprimir a linha 34.

            System.out.println((i + 1) + "-" + nome.get(i));
        }





    }
}
