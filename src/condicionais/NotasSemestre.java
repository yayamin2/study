package condicionais;

import java.util.Scanner;

public class NotasSemestre {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua nota do primeiro semestre: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a sua nota do segundo semestre: ");
        double nota2 = sc.nextDouble();

        double notaFinal = nota1 + nota2;
        System.out.printf("Nota final: %.1f%n", notaFinal);

        if (notaFinal < 60) {
            System.out.println("Reprovado");

        }

    }
}
