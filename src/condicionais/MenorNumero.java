package condicionais;

import java.util.Scanner;

/*
 * Exercício: Menor Número
 * Objetivo: Encontrar o menor número entre três valores.
 * Conceitos: if-else, comparação de valores.
 */
public class MenorNumero {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê três números
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // Assume inicialmente que A é o menor
        int menor = A;

        // Se B for menor que o menor atual, atualiza
        if (B < menor) {
        menor = B;}

        // Se C for menor que o menor atual, atualiza
        if (C < menor) {
            menor = C;}

       System.out.println("menor:" + menor);
       sc.close();
        }

    }
