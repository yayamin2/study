package repeticao;

import java.util.Scanner;

public class Poupanca {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos dias você vai depositar? ");
        System.out.println("(Você depositará 1 dólar no 1º dia, 2 dólares no 2º dia, 3 dólares no 3º dia, etc.)");
        int n = sc.nextInt();

        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        System.out.println("\nTotal final: " + soma + " dólares");
    }
}
