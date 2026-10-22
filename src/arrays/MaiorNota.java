package arrays;

/*
 * Exercício: Maior Nota
 * Objetivo: Encontrar a maior nota em um array de notas.
 * Conceitos: arrays (vetores), for loop, comparação de valores.
 */
public class MaiorNota {
    static void main(String[] args) {

        // Cria um array de double com 5 posições (índices de 0 a 4)
        double [] notas = new double[5];

        // Atribui valores a cada posição do array
        notas [0] = 8.5;
        notas [1] = 9.0;
        notas [2] = 6.0;
        notas [3] = 5.5;
        notas [4] = 7.0;

        // Assume inicialmente que a primeira nota é a maior
        double maior = notas [0];

        /*
         * for loop: percorre todas as posições do array
         * i começa em 0 e vai até 4 (menor que 5)
         */
        for (int i = 0; i < 5; i++) {
            // Se a nota atual for maior que a maior encontrada até agora
            if (notas [i] > maior) {
                maior = notas [i];  // Atualiza a maior nota
            }
        }
        System.out.println(maior);

    }
}
