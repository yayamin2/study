package revisao;

import java.util.Scanner;

public class SomaDigitos {
    static void main(String[] args) {
        int n;
        int soma =0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        n = sc.nextInt();
        do { soma += n % 10;
            n /= 10;

        } while (n > 0);

        System.out.println(soma);

    }
}
