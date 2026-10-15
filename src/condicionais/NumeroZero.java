package condicionais;

import java.util.Scanner;

public class NumeroZero {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Digite um numero");
            n = sc.nextInt();

        } while (n>0);
    }
}