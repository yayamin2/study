package condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); //Decimal com ponto

        System.out.println("Primeiro valor: ");
        double v1 = sc.nextDouble();

        System.out.println("Operação (+ - * /): ");
        char op = sc.next().charAt(0); // pega 1 caractere

        System.out.println("Segundo valor: ");
        double v2 = sc.nextDouble();

        switch (op) {
            case '+':
                System.out.println(v1 + v2);
                break;
            case '-':
                System.out.println(v1 - v2);
                break;
            case '*':
                System.out.println(v2 * v2);
                break;
            case '/':
                if (v2 == 0) System.out.println("Divisão por zero");
                else System.out.println(v1 / v2);
                break;
            default:
                System.out.println("Operação inválida");
        }
    }
}
