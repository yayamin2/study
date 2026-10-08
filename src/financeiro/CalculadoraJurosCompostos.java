package financeiro;

import java.util.Scanner;

// Simulador de investimento : juros composto mês a mês, com aporte mensal, validação de tempoe comparação com juros simples e imposto de renda

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
        while (tempo<=0){
            System.out.print("Tempo inválido digite um número maior que zero");
        tempo = sc.nextInt();}

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
        double valorInserido = aporte * tempo +valor;
        double rendimento = saldo - valorInserido;
        System.out.printf("Total de juros ganhos: R$ %.2f%n", rendimento);

        int dias = tempo * 30;
        double aliquota = 0;
        if (dias <= 180) {
            aliquota = 0.225;
        } else if (dias <= 360) {
            aliquota = 0.20;
        } else if (dias <= 720) {
            aliquota = 0.175;
        } else {
            aliquota = 0.15;
        }

        double imposto = rendimento *aliquota;
        double resgate = saldo - imposto;
        System.out.printf ("Imposto de renda: R$ %.2f%n", imposto);
        System.out.printf("Valor liquido no resgate: R$ %.2f%n", resgate);
        double jurosSimples = valor * juros * tempo /100;
        double totalSimples = jurosSimples + valor;
        System.out.printf("Total de juros simples: R$ %.2f%n", totalSimples);

    }
}
