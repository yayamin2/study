package revisao;

import java.util.Scanner;

public class MaiorDeIdade {
    static void main(String[] args) {

        int idade;

        System.out.println("Digite a idade: ");
        Scanner sc = new Scanner(System.in);
        idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
