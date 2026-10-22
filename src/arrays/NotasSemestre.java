package arrays;

import java.util.Scanner;

/*
 * Exercício: Notas do Semestre
 * Objetivo: Calcular a nota final somando as notas de dois semestres.
 * Se a nota final for menor que 60, o aluno é reprovado.
 * Conceitos: Scanner, entrada de dados, if-else, formatação de saída.
 */
public class NotasSemestre {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua nota do primeiro semestre: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a sua nota do segundo semestre: ");
        double nota2 = sc.nextDouble();

        // Calcula a nota final somando as duas notas
        double notaFinal = nota1 + nota2;
        System.out.printf("Nota final: %.1f%n", notaFinal);

        /*
         * Verifica se a nota final é menor que 60
         * Se for, o aluno é reprovado
         */
        if (notaFinal < 60) {
            System.out.println("Reprovado");

        }
        sc.close();
    }
}
