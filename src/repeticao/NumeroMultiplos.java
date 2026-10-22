package repeticao;

import java.util.Scanner;

/*
 * Exercício: Números Múltiplos
 * Objetivo: Verificar se dois números são múltiplos entre si.
 * Conceitos: if-else, operador módulo (%), operador lógico OU (||).
 */
public class NumeroMultiplos {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        /*
         * Dois números são múltiplos se:
         * - n1 é divisível por n2 (n1 % n2 == 0)
         * OU
         * - n2 é divisível por n1 (n2 % n1 == 0)
         * O operador || (OU) retorna verdadeiro se pelo menos uma condição for verdadeira
         */
        if (n1 % n2 == 0 || n2 % n1 == 0){
            System.out.println("São multiplos"); }

        else {
            System.out.println ("Não são multiplos");}
        sc.close();
    }
    }
