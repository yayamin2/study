package financeiro;

import java.util.Scanner;

// Simulador de juros: mostra o saldo mês a mês de um investimento

public class CalculadoraJurosCompostos {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor=0;
        double juros=0;
        int tempo;
        double aporte=0;

        System.out.print("Digite o valor que você quer investir: ");
        valor = sc.nextDouble();


        System.out.print("Digite por quanto tempo (em meses) você quer deixar o dinheiro investido: ");
        tempo = sc.nextInt();

        System.out.print ("Qual será o valor do aporte mensal? ");
        aporte = sc.nextDouble();

        System.out.print("Digite a taxa de juros do seu banco: ");
        juros = sc.nextDouble();

        double saldo = valor;
        for (int i = 1; i <= tempo; i++) {
            saldo = saldo + aporte;
            double aumento = saldo * (juros / 100);
            saldo = saldo + aumento;
            System.out.printf("Mês %d: R$ %.2f%n", i, saldo);
        }
    }
}
