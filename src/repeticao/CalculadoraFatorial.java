package repeticao;

import java.util.Scanner;

public class CalculadoraFatorial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para ver o valor dele em fatorial: ");
        int n = sc.nextInt();

        if (n < 0){
            System.out.println("Número negativo não é permitido. Digite novamente: ");;
            n = sc.nextInt();
        }

        int multiplicar = 1;
        for (int i = 1; i <= n; i++) {
            multiplicar *= i;
        }
        System.out.println("\n O valor do fatorial é: " + multiplicar);
    }
}
