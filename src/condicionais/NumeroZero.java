package condicionais;

import java.util.Scanner;

/*
 * Exercício: Número Zero
 * Objetivo: Ler números até que seja digitado um número menor ou igual a zero.
 * Conceitos: do-while (loop pós-teste).
 */
public class NumeroZero {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        /*
         * do-while: executa o bloco pelo menos uma vez,
         * depois verifica a condição para repetir
         * Diferente do while normal, que pode nunca executar
         */
        do {
            System.out.println("Digite um numero");
            n = sc.nextInt();

        } while (n > 0);  // Continua enquanto n for maior que 0
        sc.close();
    }
}