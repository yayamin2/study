package repeticao;

import java.util.Scanner;

public class NumerosImparesAte15 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * for loop: imprime números ímpares
         * i começa em 1 e incrementa de 2 em 2 (i = i + 2)
         * Isso garante que apenas números ímpares sejam impressos
         */
        for (int i = 1; i <= 15; i = i + 2) {
            System.out.println(i);
        }
        sc.close();
    }
}
