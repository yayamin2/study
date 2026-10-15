package matrizes;

public class MatrizSoma {
    static void main() {

        int[][] m = new int[2][3]; // 2 linhas, 3 colunas
        m[0][0] = 10;
        m[1][2] = 20;
        int soma =0;

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {

                soma =soma + m [i] [j];

                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(soma);
    }
}
