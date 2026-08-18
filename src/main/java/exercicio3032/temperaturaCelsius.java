package exercicio3032;

import java.util.Scanner;

public class temperaturaCelsius {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("digite a temperatura em Celsius");
        double Celsius = Double.parseDouble(scanner.nextLine());


        double fahrenheit = Celsius * 9.0 / 5 + 32;


        System.out.printf("%.1f°C equivalem a %.1f°F%n", Celsius, fahrenheit);

        scanner.close();















    }
}
