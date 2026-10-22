package condicionais;

import java.util.Scanner;

/*
 * Exercício: Intervalo Numérico
 * Objetivo: Verificar em qual intervalo um número se encontra.
 * Intervalos: [0,25], (25,50], (50,75], (75,100]
 * Conceitos: if-else encadeados, operadores lógicos (&&).
 */
public class IntervaloNumerico {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        /*
         * if-else encadeados: verifica múltiplas condições em sequência
         * && (E lógico): ambas as condições devem ser verdadeiras
         */
        if (numero >= 0 && numero <= 25) {
            System.out.println("Intervalo [0,25]");
        }
        else if (numero > 25 && numero <= 50) {
            System.out.println("Intervalo (25,50]");
        }
        else if (numero > 50 && numero <= 75) {
            System.out.println("Intervalo (50,75]");
        }
        else if (numero > 75 && numero <= 100) {
            System.out.println("Intervalo (75,100]");
        }
        else {
            // else é executado quando nenhuma condição anterior for verdadeira
            System.out.println("Fora de intervalo");
        }
        sc.close();
    }

}
