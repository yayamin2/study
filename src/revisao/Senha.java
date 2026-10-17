package revisao;

import java.util.Scanner;

public class Senha {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = 0;

        do {
            System.out.println("Digite a senha: ");
            senha = sc.nextInt();

        } while (senha != 1234);
        System.out.println("Acesso Permitido");

    }
}
