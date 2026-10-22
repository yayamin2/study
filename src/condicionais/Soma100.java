package condicionais;

import java.util.Scanner;

/*
 * Exercício: Soma de 1 a 100
 * Objetivo: Calcular a soma de todos os números de 1 até 100.
 * Conceitos: while, contador, acumulador.
 */
public class Soma100 {
    static void main(String[] args) {
       int soma = 0;  // Acumulador: armazena a soma total
       int i = 1;     // Contador: começa em 1 e vai até 100

        /*
         * Loop while: executa enquanto i for menor ou igual a 100
         * Em cada iteração:
         * - Adiciona i à soma
         * - Incrementa i em 1
         */
        while (i <= 100) {
          soma = soma + i;  // Equivalente a soma += i
            i++;             // Incrementa o contador
        }
        System.out.println(soma);
    }
}
