package condicionais;

import java.util.Scanner;

/*
 * Exercício: Notas do Aluno
 * Objetivo: Classificar um aluno baseado na nota.
 * Conceitos: if-else encadeados, operadores relacionais.
 */
public class NotasAluno {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota = 0;

        System.out.println("Digite a sua nota: ");
        nota = sc.nextDouble();

        /*
         * if-else encadeados: verifica múltiplas condições em sequência
         * Nota >= 7: Aprovado
         * Nota >= 5 (mas < 7): Recuperação
         * Nota < 5: Reprovado
         */
        if (nota >= 7) {
            System.out.println("Aprovado");

        } else if (nota >= 5) {
            System.out.println("Recuperação");

        } else { System.out.println("Reprovado");
        }
        sc.close();
    }

}
