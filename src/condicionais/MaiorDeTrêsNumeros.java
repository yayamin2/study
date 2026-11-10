package condicionais;

import java.util.Scanner;

public class MaiorDeTrêsNumeros {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int a = sc.nextInt();

        System.out.println("Digite outro numero: ");
        int b = sc.nextInt();

        System.out.println("Digite mais um numero: ");
        int c = sc.nextInt();

        if (a >= b && a >= c)
        System.out.println("O maior numero é: " + a);
        else if (b >= c)
        System.out.println("O maior numero é: " + b);
        else System.out.println("O maior numero é: " + c);
    }
}
