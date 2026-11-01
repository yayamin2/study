package revisao;

import java.util.Scanner;

public class ImparPar {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
}
