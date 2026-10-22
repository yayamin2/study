package revisao;

import java.util.Scanner;

/*
 * Exercício: Soma de Array
 * Objetivo: Ler 5 números, armazená-los em um array e calcular a soma.
 * Conceitos: arrays, for loop, Scanner, acumulador.
 */
public class SomaArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cria um array de int com 5 posições ("caixinhas")
        int [] numeros = new int [5];
        int soma = 0;  // Acumulador para a soma

        /*
         * for loop: percorre as 5 posições do array
         * Em cada iteração:
         * - Lê um número do usuário
         * - Armazena na posição i do array
         * - Adiciona à soma
         */
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero");
            numeros[i] = sc.nextInt();
            soma = soma + numeros[i];
        }
        // Imprime o primeiro e o último elemento do array
        System.out.println(numeros[0]);
        System.out.println(numeros[4]);
        // Imprime a soma total
        System.out.println(soma);
        sc.close();
    }
}
