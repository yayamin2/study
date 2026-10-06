import java.util.Scanner;

public class roupa {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double total = 0;

        System.out.println("Digite o codigo: ");
        int codigo1= sc.nextInt();

        System.out.println("Digite o valor: ");
        double valor1= sc.nextDouble();

        System.out.println("Digite a quantidade: ");
        int quantidade1= sc.nextInt();

        System.out.println("Digiteo o codigo: ");
        int codigo= sc.nextInt();

        System.out.println("Digite o valor: ");
        double valor2= sc.nextDouble();

        System.out.println("Digite a quantidade: ");
        int quantidade2= sc.nextInt();

        total = (quantidade1 * valor1) + (quantidade2 * valor2);

        System.out.printf("total: %.2f", total);

    }
}
