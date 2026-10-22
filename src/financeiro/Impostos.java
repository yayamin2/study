package financeiro;

import java.util.Locale;
import java.util.Scanner;

/*
 * Exercício: Cálculo de Impostos
 * Objetivo: Calcular o imposto de renda baseado no salário.
 * Faixas:
 *   - Até R$2000.00: Isento
 *   - R$2000.01 a R$3000.00: 8% sobre o valor que excede R$2000.00
 *   - R$3000.01 a R$4500.00: 8% sobre R$1000.00 + 18% sobre o valor que excede R$3000.00
 *   - Acima de R$4500.00: 8% sobre R$1000.00 + 18% sobre R$1500.00 + 28% sobre o valor que excede R$4500.00
 * Conceitos: if-else encadeados, cálculo progressivo de impostos.
 */
public class Impostos {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double imposto;

        if (salario <= 2000.00) {
            System.out.println("Isento");
        }
        /*
         * Faixa 2: 8% sobre o valor que excede R$2000.00
         * Exemplo: salário R$2500.00 -> (2500 - 2000) * 0.08 = R$40.00
         */
        else if (salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
            System.out.printf("R$ %.2f%n", imposto);
        }
        /*
         * Faixa 3: 8% sobre R$1000.00 + 18% sobre o valor que excede R$3000.00
         * Exemplo: salário R$3500.00 -> (1000 * 0.08) + (3500 - 3000) * 0.18 = R$80.00 + R$90.00 = R$170.00
         */
        else if (salario <= 4500.00) {
            imposto = (1000.00 * 0.08) + (salario - 3000.00) * 0.18;
            System.out.printf("R$ %.2f%n", imposto);
        }
        /*
         * Faixa 4: 8% sobre R$1000.00 + 18% sobre R$1500.00 + 28% sobre o valor que excede R$4500.00
         * Exemplo: salário R$5000.00 -> (1000 * 0.08) + (1500 * 0.18) + (5000 - 4500) * 0.28 = R$80.00 + R$270.00 + R$140.00 = R$490.00
         */
        else {
            imposto = (1000.00 * 0.08) + (1500.00 * 0.18) + (salario - 4500.00) * 0.28;
            System.out.printf("R$ %.2f%n", imposto);
        }
        sc.close();
    }
}
