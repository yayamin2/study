package revisao;

import java.util.Scanner;

/*
 * Exercício: Tabuada
 * Objetivo: Imprimir a tabuada de um número de 1 a 10.
 * Conceitos: for loop, Scanner, multiplicação.
 */
public class Tabuada {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int N = sc.nextInt();

        /*
         * for loop: percorre de 1 a 10
         * Em cada iteração, imprime N * i (multiplicação do número pelo contador)
         */
        for (int i = 1; i <= 10; i++) {
            System.out.println(N * i);



        }
        sc.close();



    }
}

