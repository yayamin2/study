package basico;

import java.util.Scanner;

public class MediaNotas {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double nota1;
        double nota2;
        double media;

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

       media = (nota1 + nota2) / 2;

        System.out.println("Sua média de nota é: "  + media);
    }
}
