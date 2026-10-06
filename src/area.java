import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double pi = 3.14159;
        double raio =0;

        System.out.println("digite o valor do raio:");
        raio = sc.nextDouble();

        double area = pi * raio * raio;

        System.out.printf("area: %.4f", area);


    }
}
