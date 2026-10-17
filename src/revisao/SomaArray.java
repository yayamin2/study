package revisao;

import java.util.Scanner;

public class SomaArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] numeros = new int [5]; // cria as 5 caixinhas
        int soma =0;

        for (int i =0; i <5; i++) {
            System.out.println("Digite um numero");
            numeros[i] = sc.nextInt();
            soma = soma + numeros [i];
        }
        System.out.println(numeros [0]);
        System.out.println(numeros [4]);
        System.out.println(soma);
    }
}
