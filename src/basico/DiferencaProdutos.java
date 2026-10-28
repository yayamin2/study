package basico;

import java.util.Scanner;

/*
 * Fórmula: (A * B) - (C * D)
 */
public class DiferencaProdutos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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
         */
        int diferenca = (A * B - C * D);

        System.out.printf("A diferença é: %d ", diferenca);

        sc.close();
    }
}
