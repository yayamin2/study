package repeticao;

import java.util.Scanner;

/*
 * Exercício: Diminuindo de 20 até 0
 * Objetivo: Imprimir números de 20 até 0, decrementando de 5 em 5.
 * Conceitos: for loop com decremento.
 */
public class DiminuindoDe20Ate0 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * for loop com decremento:
         * 1. int i = 20: inicialização (começa em 20)
         * 2. i >= 0: condição (executa enquanto i for maior ou igual a 0)
         * 3. i = i - 5: decremento (diminui i em 5 a cada repetição)
         */
        for (int i = 20; i >= 0; i = i - 5) {
            System.out.println(i);
        }
        sc.close();
    }
}