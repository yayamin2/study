import java.util.Scanner;

public class exercicioSoma {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int soma = 0;

        System.out.println("Digite um número: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite outro número: ");
        int numero2 = sc.nextInt();

        soma = numero1 + numero2;

        System.out.printf("A soma é: %d ", soma);

    }
}

