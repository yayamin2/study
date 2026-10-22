package condicionais;

import java.util.Scanner;

/*
 * Exercício: Idade Válida
 * Objetivo: Ler idades até que seja digitado um número negativo,
 *          e calcular a média das idades válidas.
 * Conceitos: while, if-else, contador, acumulador, cast (double).
 */
public class IdadeValida {
    static void main(String[] args) {
        int idade = 0;
        int soma = 0;
        int contador = 0;  // Conta quantas idades válidas foram digitadas
        double media = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma idade");

        /*
         * Loop while: executa enquanto a condição for verdadeira
         * Continua lendo idades enquanto idade for maior ou igual a 0
         */
        while (idade >= 0) {
            idade = sc.nextInt();

            // Verifica se a idade é válida (não negativa)
            if (idade >= 0) {
                contador++;      // Incrementa o contador
                soma += idade;  // Acumula a soma das idades (equivalente a soma = soma + idade)
            }
        }
            /*
             * Verifica se pelo menos uma idade válida foi digitada
             * Se contador for 0, não é possível calcular a média
             */
            if (contador == 0) {
                System.out.println("impossivel calcular");
            } else {
                /*
                 * Cast (double) é necessário para fazer divisão decimal
                 * Sem o cast, Java faria divisão inteira (truncaria o resultado)
                 */
               media = (double) soma / contador;

                // Exibe a média com 2 casas decimais
                System.out.printf("%.2f%n", media);
            }
        sc.close();
    }
}
