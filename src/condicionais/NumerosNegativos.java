package condicionais;

import java.util.Scanner;

/*
 * Exercício: Números Negativos
 * Objetivo: Verificar se um número é negativo ou não.
 * Conceitos: if-else, operadores relacionais.
 */
public class NumerosNegativos {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        /*
         * Verifica se o número é menor que zero
         * Se for, é negativo; caso contrário, não é negativo
         */
        if (N < 0){
        System.out.println("negativo"); }

        else {
            System.out.println ("não negativo");}
        sc.close();
    }
}
