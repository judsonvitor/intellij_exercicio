package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class listaParaEncontrarPares {
    public static void main(String[] args){
        ArrayList<Integer> numero = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

//  nesse primeiro 'for' fizemos a coleta do que o usuário digitou.
            for (int i = 0; i < 5; i++){
//  ele tem um limite de quantos numeros o usuario pode digitar '5'. Os números irão para a variável 'i' que foi criada.


            System.out.println("Digite 5 números.\n");
            int coleta = Integer.parseInt(scanner.nextLine());
//  aqui fizemos a leitura do que o usuário irá digitar.


            numero.add(coleta);
//  pegamos a variável de onde ele edigitou e atribuimos ela na inicial (coleta).
        }

            System.out.println("\n -----Apenas números pares-----");
//  esse println ficará aqui por que o intellij faz a leitura do code de cima para baixo, e irá transmitir a mensagem assim que o metodo 'for' rodar.


            for (int i = 0; i < numero.size(); i++) {
             if (numero.get(i) % 2 == 0 ) {
                 System.out.println(numero.get(i));
//  se a condição que foi solicitada no 'if' imprime esse println. Porém a conta é essencial para toda essa estrutura.
             }
            }



        scanner.close();
    }
}
