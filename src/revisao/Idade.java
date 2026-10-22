package revisao;

import java.util.Scanner;

/*
 * Exercício: Classificação por Idade
 * Objetivo: Classificar uma pessoa em faixa etária baseado na idade.
 * Faixas: <12 (Criança), 12-17 (Adolescente), >=18 (Adulto)
 * Conceitos: if-else encadeados, operadores relacionais.
 */
public class Idade {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade");
        int idade = sc.nextInt();

        /*
         * if-else encadeados: verifica múltiplas condições em sequência
         * Se idade < 12: Criança
         * Se idade < 18 (mas >= 12): Adolescente
         * Caso contrário (idade >= 18): Adulto
         */
        if (idade < 12) {
            System.out.println("Crinça");
        } else if (idade < 18) {
            System.out.println("Adolescente");
        } else System.out.println("Adulto");
        sc.close();
    }
}
