package repeticao;

import java.util.Scanner;

/*
 * Exercício: Diferente de Zero
 * Objetivo: Ler pares de números e verificar se estão em ordem crescente ou decrescente.
 * O loop termina quando os dois números forem iguais.
 * Conceitos: while, if-else, comparação de valores.
 */
public class DiferenteDeZero {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        /*
         * Loop while: continua enquanto x for diferente de y
         * Quando x == y, o loop encerra
         */
        while (x != y) {
            // Verifica se x é menor que y (ordem crescente)
            if (x < y) {
                System.out.println("Crescente");
            }
            else {
                System.out.println("Descrescente");
            }

            // Lê o próximo par de números
            x = sc.nextInt();
            y = sc.nextInt();

        }
        sc.close();
    }
}