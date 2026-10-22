package basico;

import java.util.Scanner;

/*
 * Exercício: Diferença de Produtos
 * Objetivo: Calcular a diferença entre o produto de A e B e o produto de C e D.
 * Fórmula: (A * B) - (C * D)
 * Conceitos: precedência de operadores, múltiplas variáveis, entrada de dados.
 */
public class DiferencaProdutos {
    public static void main(String[] args) {
        // Scanner para ler dados do teclado
        Scanner sc = new Scanner(System.in);

        // Lê quatro números inteiros
        System.out.println("Digite um número: ");
        int A = sc.nextInt();

        System.out.println("Digite um número: ");
        int B = sc.nextInt();

        System.out.println("Digite um número: ");
        int C = sc.nextInt();

        System.out.println("Digite um número: ");
        int D = sc.nextInt();

        /*
         * Cálculo da diferença entre produtos:
         * Primeiro multiplica A * B e C * D
         * Depois subtrai o segundo produto do primeiro
         * Os parênteses garantem a ordem correta das operações
         */
        int diferenca = (A * B - C * D);

        // Exibe o resultado usando printf com formatação
        System.out.printf("A diferença é: %d ", diferenca);
        
        // Fecha o Scanner
        sc.close();
    }
}
