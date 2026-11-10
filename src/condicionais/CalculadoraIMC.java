package condicionais;

import java.util.Scanner;

public class CalculadoraIMC {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double IMC;

        System.out.println("Digite seu peso:");
        double peso = sc.nextDouble();

        System.out.println("Digite sua altura:");
        double altura = sc.nextDouble();

        IMC = peso / (altura * altura);

        if (IMC < 18.5)
            System.out.println("Abaixo do peso");
        else if (IMC < 25)
            System.out.println("Normal");
        else if (IMC < 30)
            System.out.println("Acima do peso");

        else System.out.println("Obesidade");

    }
}
