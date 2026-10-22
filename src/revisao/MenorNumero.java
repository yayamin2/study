package revisao;

/*
 * Exercício: Menor Número em Array
 * Objetivo: Encontrar o menor número em um array de 6 elementos.
 * Conceitos: arrays, for loop, comparação de valores.
 */
public class MenorNumero {
    static void main(String[] args) {

        // Cria um array de int com 6 posições
        int[] numero = new int[6];

        // Atribui valores a cada posição do array
        numero[0] = 8;
        numero[1] = 9;
        numero[2] = 6;
        numero[3] = 10;
        numero[4] = 2;
        numero[5] = 7;

        // Assume inicialmente que o primeiro elemento é o menor
        int menor = numero[0];

        /*
         * for loop: percorre todas as posições do array
         * Se encontrar um número menor que o menor atual, atualiza
         */
        for (int i = 0; i < 6; i++) {
            if (numero[i] < menor) {
                menor = numero[i];
            }
        }
        System.out.println(menor);
    }
}