package arrays;

/*
 * Exercício: Notas
 * Objetivo: Calcular a soma e a média de notas armazenadas em um array.
 * Conceitos: arrays, for loop, acumulador, cálculo de média.
 */
public class Notas {
    static void main() {

        // Cria um array de double com 5 posições
        double [] notas = new double[5];
        double soma = 0;  // Acumulador para a soma das notas

        // Atribui valores a cada posição do array
        notas [0] = 8.5;
        notas [1] = 9.0;
        notas [2] = 6.0;
        notas [3] = 5.5;
        notas [4] = 7.0;

        /*
         * for loop: percorre todas as posições do array
         * Em cada iteração, adiciona a nota atual à soma
         */
        for (int i = 0; i < 5; i++) {
            soma = soma + notas [i];
        }
        System.out.println( "Soma das notas: " + soma );

        // Calcula a média dividindo a soma pelo número de notas (5)
        double media = soma / 5;
        System.out.println ("Média do aluno: " + media);

    }
}
