import java.util.Scanner;

public class identificarVogais {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

    System.out.println("Digite seu nome: ");
    String identificarVogais = scanner.nextLine().strip();


    for (int i = 0; i < identificarVogais.length(); i++) {


       char texo = Character.toLowerCase(identificarVogais.charAt(i));
       if (texo == 'a' || texo == 'e' || texo == 'i' || texo == 'o' || texo == 'u') {
           System.out.println("Seu nome possuí vogal '"+ " " +   texo  + " " + "' na posição "+ (i + 1 ));

       }
    }



scanner.close();
    }
}
