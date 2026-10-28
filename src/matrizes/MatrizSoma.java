package matrizes;

public class MatrizSoma {
    static void main() {

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

                System.out.print(m[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println(soma);
    }
}
