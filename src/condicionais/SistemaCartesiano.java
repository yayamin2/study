package condicionais;

import java.util.Scanner;

/*
 * Exercício: Sistema Cartesiano
 * Objetivo: Ler múltiplos pontos (x, y) e identificar seus quadrantes.
 * O loop termina quando x ou y for 0.
 * Conceitos: while, if-else encadeados, operadores lógicos.
 */
public class SistemaCartesiano {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        /*
         * Loop while: continua enquanto x e y forem diferentes de 0
         * Quando um deles for 0, o loop encerra
         */
        while (x != 0 && y != 0) {

            // Q4: x positivo e y negativo
            if (x > 0 && y < 0) {
                System.out.println("Q4");
            }

            // Q3: x negativo e y negativo
            else if (x < 0 && y < 0){
                System.out.println("Q3");
            }

            // Q2: x negativo e y positivo
            else if (x < 0 && y > 0){
                System.out.println("Q2");
            }

            // Q1: x positivo e y positivo
            else if (x > 0 && y > 0) {
                System.out.println("Q1");

            }
            // Lê o próximo ponto
            x = sc.nextDouble();
            y = sc.nextDouble();

        }
        sc.close();
    }
}