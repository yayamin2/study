package condicionais;

import java.util.Scanner;

public class NotasAluno {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota=0;

        System.out.println("Digite a sua nota: ");
        nota = sc.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprovado");

        } else if (nota >= 5) {
            System.out.println("Recuperação");

        } else { System.out.println("Reprovado");
        }

    }

}
