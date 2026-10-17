package revisao;

import java.util.Scanner;

public class Idade {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade");
        int idade = sc.nextInt();

        if (idade < 12) {
            System.out.println("Crinça");
        } else if (idade < 18) {
            System.out.println("Adolescente");
        } else System.out.println("Adulto");

    }
}
