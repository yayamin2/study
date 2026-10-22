package basico;

import java.util.Scanner;

/*
 * Exercício: Área do Círculo
 * Objetivo: Calcular a área de um círculo dado o raio.
 * Fórmula: A = π * r²
 * Conceitos: tipo double (números decimais), operações matemáticas, formatação de saída.
 */
public class AreaCirculo {
    public static void main(String[] args) {
        // Scanner para ler dados do teclado
        Scanner sc = new Scanner (System.in);

        // Valor de PI (constante aproximada)
        // double é usado para números com casas decimais
        double pi = 3.14159;
        
        // Variável para armazenar o raio do círculo
        double raio = 0;

        // Solicita ao usuário o valor do raio
        System.out.println("digite o valor do raio:");
        // nextDouble() lê um número decimal (com vírgula ou ponto)
        raio = sc.nextDouble();

        // Cálculo da área do círculo: π * raio * raio (ou π * r²)
        double area = pi * raio * raio;

        // %.4f formata o número com 4 casas decimais
        System.out.printf("basico.area: %.4f", area);

        // Fecha o Scanner para liberar recursos
        sc.close();
    }
}
