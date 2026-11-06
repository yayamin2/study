package basico;

import java.util.Scanner;

public class Olá {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String nome;
        int idade;

        System.out.print("Digite o seu nome:");
        nome = sc.nextLine();

        System.out.print("Digite a sua idade:");
        idade = sc.nextInt();

        System.out.println("Olá " + nome + " você tem " + idade + " anos");


    }

}
