package condicionais;

import java.util.Scanner;

/*
 * Exercício: Par ou Ímpar
 * Objetivo: Verificar se um número é par ou ímpar.
 * Conceitos: if-else, operador módulo (%).
 */
public class ParImpar {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt();

        /*
         * Operador módulo (%) retorna o resto da divisão
         * Se N % 2 for 0, o número é par (divisível por 2)
         * Caso contrário, é ímpar
         */
        if (N % 2 == 0){
            System.out.println("Par"); }

        else {
            System.out.println ("Impar");}
        sc.close();
    }
}
