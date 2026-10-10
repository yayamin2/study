package condicionais;

import java.util.Scanner;

public class IdadeValida {
    static void main(String[] args) {
        int idade =0;
        int soma =0;
       int contador =0;
       double media =0;

        Scanner sc = new Scanner(System.in);

       System.out.println("Digite uma idade");


        while (idade >= 0) {
            idade = sc.nextInt();

            if (idade >= 0) {
                contador++;
                soma += idade;
            }
        }
            if (contador ==0) {
                System.out.println("impossivel calcular");
            } else {
               media = (double) soma / contador;

                System.out.printf("%.2f%n", media);
            }
    }
}
