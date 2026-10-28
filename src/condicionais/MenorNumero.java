package condicionais;

import java.util.Scanner;

public class MenorNumero {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // Assume inicialmente que A é o menor
        int menor = A;

        // Se B for menor que o menor atual, atualiza
        if (B < menor) {
            menor = B;
        }

        // Se C for menor que o menor atual, atualiza
        if (C < menor) {
            menor = C;
        }

        System.out.println("menor:" + menor);
        sc.close();
    }

}
