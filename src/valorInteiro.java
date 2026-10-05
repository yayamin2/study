import java.util.Scanner;

public class valorInteiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int A = sc.nextInt();

        System.out.println("Digite um número: ");
        int B = sc.nextInt();

        System.out.println("Digite um número: ");
        int C = sc.nextInt();

        System.out.println("Digite um número: ");
        int D = sc.nextInt();

        int diferenca = (A * B - C * D);

        System.out.printf("A diferença é: %d ", diferenca);
    }
}
