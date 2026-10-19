package repeticao;

import java.util.Scanner;

public class TabuadaRegressiva {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int N = sc.nextInt();


        for (int i = 10; i >= 1; i--) {
            System.out.println(N * i);
        }
    }
}
