import java.util.Scanner;

public class geometria {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de A ");
        double A = sc.nextDouble();

        System.out.println("Digite o valor de B ");
        double B = sc.nextDouble();

        System.out.println("Digite o valor de C ");
        double C = sc.nextDouble();

        double triangulo = (A * C) / 2.0;
        double circulo = 3.14159 * C * C;
        double trapezio = ((A + A) * C) / 2.0;
        double quadrado = B * B;
        double retangulo = A * B;

        System.out.printf("triangulo %.3f%n", triangulo);
        System.out.printf("circulo %.3f%n", circulo);
        System.out.printf("trapezio %.3f%n", trapezio);
        System.out.printf("quadrado %.3f%n", quadrado);
        System.out.printf("retangulo %.3f%n", retangulo);
    }
}
