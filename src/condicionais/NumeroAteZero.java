package condicionais;

import java.util.Scanner;

public class NumeroAteZero {
    static void main(String[] args) {

        System.out.print("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int soma = 0;

        while (numero != 0) {
            System.out.println("numero maior que zero");

            soma = soma + numero;

            System.out.print("Digite outro numero ou 0 para sair: ");
            numero = sc.nextInt();
        }

        System.out.println("A soma dos numeros é: " + soma);
    }
    }

