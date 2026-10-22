package repeticao;

import java.util.Scanner;

/*
 * Exercício: Senha
 * Objetivo: Ler uma senha até que o usuário digite a senha correta (2002).
 * Conceitos: while, validação de entrada.
 */
public class Senha {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();

        /*
         * Loop while: continua enquanto a senha for diferente de 2002
         * Enquanto a senha estiver incorreta, solicita novamente
         */
        while (senha != 2002) {
            System.out.println("Senha Invalida");
            senha = sc.nextInt();
        }

        // Quando a senha correta é digitada, o loop encerra
        System.out.println("Acesso Permitido");
        sc.close();
    }
}
