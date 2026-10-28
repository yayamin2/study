package repeticao;

import java.util.Scanner;

public class NumerosParesAte20 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * for loop: imprime números pares
         * i começa em 2 e incrementa de 2 em 2 (i = i + 2)
         * Isso garante que apenas números pares sejam impressos
         */
        for (int i = 2; i <= 20; i = i + 2) {
            System.out.println(i);
        }
        sc.close();
    }
}
