package repeticao;

import java.util.Scanner;

public class NumeroPrimo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número inteiro positivo: ");
        numero = sc.nextInt();

        boolean ehPrimo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                ehPrimo = false;
                break;
            }
        }

        if (ehPrimo) {
            System.out.println("O número é primo!");
        }
    }
}

