package repeticao;

import java.util.Scanner;

public class CodigoInverso {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int invertido = 0;

        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();

        while (numero != 0) {
            int digito = numero % 10; // Pega o último dígito
            invertido = invertido * 10 + digito; // Constrói o número invertido
            numero /= 10; // Remove o último dígito do número original
        }

        System.out.println(invertido);
    }
}