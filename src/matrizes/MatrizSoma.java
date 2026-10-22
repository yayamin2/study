package matrizes;

/*
 * Exercício: Soma de Matriz
 * Objetivo: Criar uma matriz 2x3, preencher alguns valores e calcular a soma de todos os elementos.
 * Conceitos: matrizes (arrays bidimensionais), for loops aninhados.
 */
public class MatrizSoma {
    static void main() {

        // Cria uma matriz de inteiros com 2 linhas e 3 colunas
        int[][] m = new int[2][3]; // 2 linhas, 3 colunas
        
        // Atribui valores a posições específicas da matriz
        m[0][0] = 10;  // Linha 0, coluna 0
        m[1][2] = 20;  // Linha 1, coluna 2
        
        int soma = 0;  // Acumulador para a soma dos elementos

        /*
         * for loops aninhados: percorre a matriz
         * Loop externo (i): percorre as linhas (0 a 1)
         * Loop interno (j): percorre as colunas (0 a 2)
         */
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {

                // Adiciona o elemento atual à soma
                soma = soma + m[i][j];

                // Imprime o elemento atual (print não pula linha)
                System.out.print(m[i][j] + " ");
            }
            // println pula para a próxima linha após imprimir uma linha da matriz
            System.out.println();
        }
        // Imprime a soma total de todos os elementos
        System.out.println(soma);
    }
}
