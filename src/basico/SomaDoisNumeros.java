package basico;

import java.util.Scanner;

/*
 * Exercício: Soma de Dois Números
 * Objetivo: Ler dois números inteiros do usuário e exibir a soma deles.
 * Conceitos: Scanner, variáveis, entrada de dados, operações matemáticas.
 */
public class SomaDoisNumeros {
    static void main(String[] args) {

        // Scanner é usado para ler dados do teclado (entrada padrão)
        Scanner sc = new Scanner(System.in);

        // Variável para armazenar o resultado da soma
        int soma = 0;

        // Solicita ao usuário que digite o primeiro número
        System.out.println("Digite um número: ");
        // nextInt() lê um número inteiro digitado pelo usuário
        int numero1 = sc.nextInt();

        // Solicita ao usuário que digite o segundo número
        System.out.println("Digite outro número: ");
        int numero2 = sc.nextInt();

        // Realiza a soma dos dois números e armazena na variável soma
        soma = numero1 + numero2;

        // printf permite formatar a saída. %d é substituído pelo valor da variável soma
        System.out.printf("A soma é: %d ", soma);

        // Boa prática: fechar o Scanner após o uso para liberar recursos
        sc.close();
    }
}

