package revisao;

import java.util.Scanner;

public class MaiorNumero {
    static void main(String[] args) {
        int a;
        int b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        a = sc.nextInt();

        System.out.println("Digite um numero");
        b = sc.nextInt();

        int maior = (a > b) ? a : b;

        System.out.println("O maior número é: " + maior);
    }
}
