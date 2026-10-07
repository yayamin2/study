package financeiro;

import java.util.Scanner;

public class CalculadoraJurosCompostos {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor=0;
        double juros=0;
        int tempo;

        System.out.print("Digite o valor que você quer investir: ");
        valor = sc.nextDouble();


        System.out.print("Digite por quanto tempo (em meses) você quer deixar o dinheiro investido: ");
        tempo = sc.nextInt();

        System.out.print("Digite a taxa de juros do seu banco: ");
        juros = sc.nextDouble();

        double valorFinal = valor * Math.pow(1+ juros / 100, tempo);

        System.out.printf ("O valor final será: %.2f%n", valorFinal);
    }
}
