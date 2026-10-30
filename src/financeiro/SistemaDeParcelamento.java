package financeiro;

import java.util.Scanner;

public class SistemaDeParcelamento {
    static void main(String[] args) {

        double valorCompra = 0;

        int quantidadeParcelas = 0;

        System.out.println("Digite o valor da compra: ");
        Scanner sc = new Scanner(System.in);
        valorCompra = sc.nextDouble();

        System.out.println("Digite a quantidade de parcelas: ");
        quantidadeParcelas = sc.nextInt();

        double valorParcela = valorCompra / quantidadeParcelas;

        for (int contador =0; contador <quantidadeParcelas; contador++) {
            System.out.printf("Parcela "+ (contador +1) + " de R$ " + "%.2f%n", valorParcela);

        }

    }
}
