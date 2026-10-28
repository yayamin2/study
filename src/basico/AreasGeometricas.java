package basico;

import java.util.Scanner;

/*
 * Fórmulas:
 *   - Triângulo: (A * C) / 2
 *   - Círculo: π * C²
 *   - Trapézio: ((A + B) * C) / 2
 *   - Quadrado: B²
 *   - Retângulo: A * B
 */
public class AreasGeometricas {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Lê o valor de A (base do triângulo e retângulo)
        System.out.println("Digite o valor de A ");
        double A = sc.nextDouble();

        // Lê o valor de B (lado do quadrado e base do trapézio)
        System.out.println("Digite o valor de B ");
        double B = sc.nextDouble();

        // Lê o valor de C (altura do triângulo/trapézio e raio do círculo)
        System.out.println("Digite o valor de C ");
        double C = sc.nextDouble();

        // Cálculo da área do triângulo: (base * altura) / 2
        double triangulo = (A * C) / 2.0;

        // Cálculo da área do círculo: π * raio²
        double circulo = 3.14159 * C * C;

        // Cálculo da área do trapézio: ((baseMaior + baseMenor) * altura) / 2
        double trapezio = ((A + B) * C) / 2.0;

        // Cálculo da área do quadrado: lado²
        double quadrado = B * B;

        // Cálculo da área do retângulo: base * altura
        double retangulo = A * B;

        System.out.printf("triangulo %.3f%n", triangulo);
        System.out.printf("circulo %.3f%n", circulo);
        System.out.printf("trapezio %.3f%n", trapezio);
        System.out.printf("quadrado %.3f%n", quadrado);
        System.out.printf("retangulo %.3f%n", retangulo);

        sc.close();
    }
}
