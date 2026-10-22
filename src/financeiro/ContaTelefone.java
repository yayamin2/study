package financeiro;

import java.util.Locale;
import java.util.Scanner;

/*
 * Exercício: Conta de Telefone
 * Objetivo: Calcular o valor da conta de telefone.
 * Regra: R$50.00 fixo + R$2.00 por minuto excedente (acima de 100 minutos).
 * Conceitos: if-else, operador de atribuição composta (+=).
 */
public class ContaTelefone {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int minutos = sc.nextInt();

        // Valor base da conta (fixo)
        double conta = 50.0;

        /*
         * Se os minutos excederem 100,
         * adiciona R$2.00 para cada minuto excedente
         * (minutos - 100) calcula quantos minutos excedem
         */
        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;  // Equivalente a conta = conta + (minutos - 100) * 2.0
        }
        System.out.printf("Valor da conta: R$ %.2f%n", conta);
        sc.close();
    }
}
