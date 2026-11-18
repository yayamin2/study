package repeticao;

import java.util.Scanner;

public class SenhaCofre {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int senha;
        int tentativas = 0;

        do {
            System.out.println("Digite a senha do cofre: ");
            senha = sc.nextInt();
            tentativas++;
        } while (senha != 1234);

        System.out.println("Número de tentativas: " + tentativas);
    }
}
