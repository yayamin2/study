package revisao;

import java.util.Scanner;

public class Senha {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = 0;

        /*
         * do-while: executa o bloco pelo menos uma vez,
         * depois verifica a condição para repetir
         * Continua solicitando a senha enquanto for diferente de 1234
         */
        do {
            System.out.println("Digite a senha: ");
            senha = sc.nextInt();

        } while (senha != 1234);

        // Quando a senha correta é digitada, o loop encerra
        System.out.println("Acesso Permitido");
        sc.close();
    }
}
