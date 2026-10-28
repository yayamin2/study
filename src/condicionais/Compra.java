package condicionais;

import java.util.Scanner;

public class Compra {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorCompra = 0;

        System.out.println("Qual o valor da sua compra?");
        valorCompra = sc.nextDouble();

        if (valorCompra > 200) {

            System.out.println("Frete grátis!!");
        } else {
            System.out.println("Terá que pagar o frete!");
        }
    }
}
