package revisao;

import java.util.Scanner;

/*
 * Exercício: Múltiplos de 5
 * Objetivo: Imprimir todos os múltiplos de 5 de 1 até 50.
 * Conceitos: for loop, operador módulo (%), if.
 */
public class Multiplo5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * for loop: percorre números de 1 a 50
         * if: verifica se o número é múltiplo de 5 (resto da divisão por 5 é 0)
         */
        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {

                System.out.println(i);
            }
        }
        sc.close();
    }
}