package condicionais;

import java.util.Scanner;

/*
 * Exercício: Dia da Semana
 * Objetivo: Converter um número de 1 a 7 no nome do dia da semana correspondente.
 * Conceitos: switch-case, break, default.
 */
public class DiaDaSemana {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;

        System.out.println("Digite um numero de 1 a 7: ");
        dia = sc.nextInt();

        /*
         * switch-case é uma estrutura de seleção múltipla
         * Verifica o valor da variável 'dia' e executa o case correspondente
         * break é necessário para sair do switch após executar um case
         */
        switch (dia) {
            case 1:
                System.out.println("Segunda");
                break;

            case 2:
                System.out.println("Terça");
                break;

            case 3:
                System.out.println("Quarta");
                break;

            case 4:
                System.out.println("Quinta");
                break;

            case 5:
                System.out.println("Sexta");
                break;

            case 6:
                System.out.println("Sabado");
                break;

            case 7:
                System.out.println("Domingo");
                break;

            // default é executado quando nenhum case corresponde
            default:
                System.out.println("Dia inválido!");

        }
        sc.close();
    }
}