package financeiro;

import java.util.Scanner;

/*
 * Exercício: Compra de Roupas
 * Objetivo: Calcular o total de uma compra de duas peças de roupa.
 * Conceitos: Scanner, múltiplas variáveis, operações matemáticas.
 */
public class CompraRoupa {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double total = 0;

        // Lê os dados da primeira peça (código, valor e quantidade)
        System.out.println("Digite o codigo: ");
        int codigo1 = sc.nextInt();

        System.out.println("Digite o valor: ");
        double valor1 = sc.nextDouble();

        System.out.println("Digite a quantidade: ");
        int quantidade1 = sc.nextInt();

        // Lê os dados da segunda peça (código, valor e quantidade)
        System.out.println("Digiteo o codigo: ");
        int codigo = sc.nextInt();

        System.out.println("Digite o valor: ");
        double valor2 = sc.nextDouble();

        System.out.println("Digite a quantidade: ");
        int quantidade2 = sc.nextInt();

        /*
         * Calcula o total da compra:
         * (quantidade1 * valor1) + (quantidade2 * valor2)
         */
        total = (quantidade1 * valor1) + (quantidade2 * valor2);

        System.out.printf("total: %.2f", total);
        sc.close();
    }
}
