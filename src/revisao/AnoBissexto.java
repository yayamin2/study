package revisao;

import java.util.Scanner;

public class AnoBissexto {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um ano:");
        int ano = sc.nextInt();

        boolean b = (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
        System.out.println(b);
    }
}
