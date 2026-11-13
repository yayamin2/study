package financeiro;

import java.util.Scanner;

public class CaixaEletronico {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 1000;
        int opcao;
        double valor = 0;

        System.out.println("Bem vindo ao caixa eletronico");
        System.out.println();

        do {
            System.out.println("Digite a opcao desejada: ");
            System.out.println(" 1- ver saldo");
            System.out.println(" 2- sacar");
            System.out.println(" 0- sair");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo e: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor a ser sacado: ");
                valor = sc.nextDouble();
            } if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque realizado com sucesso");
            } else if (opcao == 0) {
                System.out.println("Saindo do sistema");
            } else {
                System.out.println("Opcao invalida");
            }
        } while (opcao != 0);

        System.out.println("Obrigado por usar o caixa eletronico");
    }
}

