package condicionais;

import java.util.Locale;
import java.util.Scanner;

/*
 * Exercício: Quadrante
 * Objetivo: Identificar em qual quadrante um ponto (x, y) se encontra.
 * Conceitos: if-else encadeados, operadores lógicos, sistema cartesiano.
 */
public class Quadrante {
    static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            // Lê as coordenadas x e y
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            /*
             * Verifica a posição do ponto:
             * - Se ambos são 0, está na origem
             * - Se x é 0, está no eixo Y
             * - Se y é 0, está no eixo X
             * - Caso contrário, verifica o quadrante
             */
            if (x == 0.0 && y == 0.0) {
                System.out.println("Origem");
            }
            else if (x == 0.0) {
                System.out.println("Eixo Y");
            }
            else if (y == 0.0) {
                System.out.println("Eixo X");
            }
            // Q1: x positivo e y positivo
            else if (x > 0.0 && y > 0.0) {
                System.out.println("Q1");
            }
            // Q2: x negativo e y positivo
            else if (x < 0.0 && y > 0.0) {
                System.out.println("Q2");
            }
            // Q3: x negativo e y negativo
            else if (x < 0.0 && y < 0.0) {
                System.out.println("Q3");
            }
            // Q4: x positivo e y negativo
            else if (x > 0.0 && y < 0.0) {
                System.out.println("Q4");
            }
        sc.close();
    }
    }
