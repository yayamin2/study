package condicionais;

import java.util.Scanner;

public class DuracaoJogo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int duracao;

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;}

        else {duracao = 24 - horaInicial + horaFinal;}

            System.out.println("O jogo durou:" + duracao +"horas");

    }
}
