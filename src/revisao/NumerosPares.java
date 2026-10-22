package revisao;

import java.util.Scanner;

/*
 * Exercício: Contagem de Números Pares
 * Objetivo: Contar quantos números pares existem em um array de 8 elementos.
 * Conceitos: arrays, for loop, operador módulo (%), contador.
 */
public class NumerosPares {
    static void main(String[] args) {

        // Cria um array de int com 8 posições
        int[] numero = new int[8];
        int par = 0;  // Contador para números pares
        int soma = 0;  // Variável não utilizada neste exercício

        // Atribui valores a cada posição do array
        numero[0] = 8;
        numero[1] = 3;
        numero[2] = 6;
        numero[3] = 10;
        numero[4] = 2;
        numero[5] = 7;
        numero[6] = 5;
        numero[7] = 4;

        /*
         * for loop: percorre todas as posições do array
         * if: verifica se o número é par (resto da divisão por 2 é 0)
         */
        for (int i = 0; i <= 7; i++) {

            if (numero[i] % 2 == 0) {
                par = par + 1;  // Incrementa o contador de pares
            }
        }
        System.out.println(par);
    }
}