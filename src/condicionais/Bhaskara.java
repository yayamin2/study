package condicionais;

import java.util.Locale;
import java.util.Scanner;

/*
 * Exercício: Fórmula de Bhaskara
 * Objetivo: Calcular as raízes de uma equação do segundo grau (ax² + bx + c = 0)
 * Fórmula: x = (-b ± √Δ) / (2a), onde Δ = b² - 4ac
 * Conceitos: if-else, Math.sqrt(), Locale, tratamento de casos impossíveis.
 */
public class Bhaskara {
    static void main(String[] args) {

        // Configura o locale para US (usa ponto como separador decimal)
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        // Lê os coeficientes da equação: A, B e C
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        // Cálculo do delta (discriminante): Δ = b² - 4ac
        double delta = B * B - 4 * A * C;

        /*
         * Verifica se é possível calcular as raízes:
         * - Se A for 0, não é equação do segundo grau
         * - Se delta for negativo, não existem raízes reais
         */
        if (A == 0 || delta < 0.0) {
            System.out.println("Impossivel calcular");
        }
            else{
                // Cálculo das duas raízes usando a fórmula de Bhaskara
                // Math.sqrt() calcula a raiz quadrada
                double r1 = (-B + Math.sqrt(delta)) / (2 * A);
                double r2 = (-B - Math.sqrt(delta)) / (2 * A);

            // Exibe as raízes com 5 casas decimais
            System.out.printf("r1 = %.5f ", r1);
            System.out.printf("r2 =  %.5f = ", r2);


            }
        }
    }

