package financeiro;

import java.util.Locale;
import java.util.Scanner;

/*
 * Exercício: Conta de Lanchonete
 * Objetivo: Calcular o total da conta baseado no código do item e quantidade.
 * Códigos e preços: 1-R$4.00, 2-R$4.50, 3-R$5.00, 4-R$2.00, 5-R$1.50
 * Conceitos: if-else encadeados, Locale, formatação monetária.
 */
public class ContaLanchonete {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        double preco = 0;
        int quantidade = sc.nextInt();
        double total = 0;

        /*
         * Verifica o código do item e calcula o total
         * Cada código tem um preço diferente
         */
        if (codigo == 1){
            total = quantidade * 4.00;}

        else if (codigo == 2){
            total = quantidade * 4.50;}

        else if (codigo == 3){
            total = quantidade * 5.00;}

        else if (codigo == 4) {
            total = quantidade * 2.00;}

        else if (codigo == 5) {
            total = quantidade * 1.50;}

        System.out.printf("total R$ %.2f%n", total);
        sc.close();
    }
    }


