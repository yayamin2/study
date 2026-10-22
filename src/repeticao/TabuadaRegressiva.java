package repeticao;

import java.util.Scanner;

/*
 * Exercício: Tabuada Regressiva
 * Objetivo: Imprimir a tabuada de um número de forma regressiva (de 10 até 1).
 * Conceitos: for loop com decremento, multiplicação.
 */
public class TabuadaRegressiva {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int N = sc.nextInt();

        /*
         * for loop com decremento:
         * i começa em 10 e decrementa até 1
         * Em cada iteração, imprime N * i
         */
        for (int i = 10; i >= 1; i--) {
            System.out.println(N * i);
        }
        sc.close();
    }
}
