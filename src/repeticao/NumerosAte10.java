package repeticao;

import java.util.Scanner;

/*
 * Exercício: Números até 10
 * Objetivo: Imprimir os números de 1 até 10.
 * Conceitos: for loop.
 */
public class NumerosAte10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * for loop: imprime números de 1 a 10
         * i começa em 1 e incrementa até 10
         */
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
