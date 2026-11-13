package repeticao;

import java.util.Scanner;

public class Nota {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;

        do {
            System.out.println("Digite a nota de 0 a 10: ");
            nota = sc.nextInt();
        }while (nota <0 || nota >10);
        System.out.println("Nota: " + nota);


    }
}
