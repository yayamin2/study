package condicionais;

import java.util.Scanner;

/*
 * Exercício: Duração do Jogo
 * Objetivo: Calcular a duração de um jogo dado o horário inicial e final.
 * Conceitos: if-else, operadores relacionais, lógica de tempo.
 */
public class DuracaoJogo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê os horários inicial e final
        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int duracao;

        /*
         * Se o horário inicial for menor que o final,
         * o jogo termina no mesmo dia
         */
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;}

        /*
         * Se o horário inicial for maior ou igual ao final,
         * o jogo termina no dia seguinte (passa da meia-noite)
         * Fórmula: 24 - horaInicial + horaFinal
         */
        else {duracao = 24 - horaInicial + horaFinal;}

            System.out.println("O jogo durou:" + duracao +"horas");

        sc.close();
    }
}
