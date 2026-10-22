package repeticao;

import java.util.Scanner;

/*
 * Exercício: Número até Zero
 * Objetivo: Ler números e somá-los até que seja digitado 0.
 * Conceitos: while, acumulador.
 */
public class NumeroAteZero {
    static void main(String[] args) {

        System.out.print("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int soma = 0;  // Acumulador para armazenar a soma

        /*
         * Loop while: continua enquanto numero for diferente de 0
         * Quando numero == 0, o loop encerra
         */
        while (numero != 0) {
            System.out.println("numero maior que zero");

            // Adiciona o número à soma
            soma = soma + numero;

            System.out.print("Digite outro numero ou 0 para sair: ");
            numero = sc.nextInt();
        }

        System.out.println("A soma dos numeros é: " + soma);
        sc.close();
    }
    }

