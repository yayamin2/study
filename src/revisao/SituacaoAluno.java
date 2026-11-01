package revisao;

import java.util.Scanner;

public class SituacaoAluno {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;

        System.out.println("Digite a nota: ");
        nota = sc.nextDouble();

        if (nota < 5){
            System.out.println("Reprovado");
        } else if (nota >=5 && nota < 7) {
            System.out.println("Recuperação");
        }
        else {
            System.out.println("Aprovado");
        }

    }
}
