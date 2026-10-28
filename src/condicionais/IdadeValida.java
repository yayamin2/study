package condicionais;

import java.util.Scanner;

public class IdadeValida {
    static void main(String[] args) {
        int idade = 0;
        int soma = 0;
        int contador = 0;  // Conta quantas idades válidas foram digitadas
        double media = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma idade");

        while (idade >= 0) {
            idade = sc.nextInt();

            if (idade >= 0) {
                contador++;      // Incrementa o contador
                soma += idade;  // Acumula a soma das idades (equivalente a soma = soma + idade)
            }
        }

        if (contador == 0) {
            System.out.println("impossivel calcular");
        } else {

            media = (double) soma / contador;

            System.out.printf("%.2f%n", media);
        }
        sc.close();
    }
}
