package repeticao;

import java.util.Scanner;

public class DiferenteDeZero {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != y) {
            // Verifica se x é menor que y (ordem crescente)
            if (x < y) {
                System.out.println("Crescente");
            } else {
                System.out.println("Descrescente");
            }

            // Lê o próximo par de números
            x = sc.nextInt();
            y = sc.nextInt();

        }
        sc.close();
    }
}