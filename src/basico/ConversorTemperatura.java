package basico;

import java.util.Scanner;

public class ConversorTemperatura {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celcius: ");
        double c = sc.nextDouble();
        double f;

        f = c * 9 / 5 + 32;

        System.out.printf("A temperatura em Fahrenheit: " +f);


    }
}
