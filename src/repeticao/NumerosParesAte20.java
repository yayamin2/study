package repeticao;

import java.util.Scanner;

public class NumerosParesAte20 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 2; i <= 20; i = i+ 2) {
            System.out.println(i);
        }
    }
}
