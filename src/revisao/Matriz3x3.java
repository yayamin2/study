package revisao;

import java.util.Scanner;

/*
 * Exercício: Matriz 3x3
 * Objetivo: Criar uma matriz 3x3, imprimi-la e encontrar o maior valor.
 * Conceitos: matrizes, for loops aninhados, matriz.length.
 */
public class Matriz3x3 {
    static void main(String[] args) {

        // 1. Declara e inicializa a matriz 3x3 com alguns valores de exemplo
        int[][] matriz = {
                {4, 12, 7},
                {9, 25, 3},
                {1, 15, 8}
        };

        // 2. Imprime a matriz em formato de tabela
        System.out.println("Matriz 3x3");
        /*
         * matriz.length retorna o número de linhas da matriz
         * matriz[i].length retorna o número de colunas da linha i
         */
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        // Assume que o primeiro elemento é o maior inicialmente
        int maior = matriz[0][0];
        
        /*
         * Percorre toda a matriz para encontrar o maior valor
         */
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        System.out.println("O maior valor encontrado na matriz é: " + maior);
    }

}
