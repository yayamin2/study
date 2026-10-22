package condicionais;

import java.util.Scanner;

/*
 * Exercício: Soma de Números de 1 até N
 * Objetivo: Calcular a soma de todos os números de 1 até um número N digitado pelo usuário.
 * Exemplo: Se N = 5, soma = 1 + 2 + 3 + 4 + 5 = 15
 * Conceitos: while, contador, acumulador.
 */
public class SomaDeNumeros {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;  // Acumulador: armazena a soma total
        int i = 1;     // Contador: começa em 1 e vai até N

        System.out.println("Digite um numero:");
        int N = sc.nextInt();

        /*
         * Loop while: executa enquanto i for menor ou igual a N
         * Em cada iteração:
         * - Adiciona i à soma
         * - Incrementa i em 1
         */
        while (i <= N) {
            soma = soma + i;  // Equivalente a soma += i
            i++;              // Incrementa o contador
        }
        System.out.println(soma);
        sc.close();
    }
}
