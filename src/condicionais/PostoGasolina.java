package condicionais;

import java.util.Scanner;

/*
 * Exercício: Posto de Gasolina
 * Objetivo: Contar quantos clientes abasteceram com cada tipo de combustível.
 * Códigos: 1-Álcool, 2-Gasolina, 3-Diesel, 4-Fim
 * Conceitos: while, if-else encadeados, contadores.
 */
public class PostoGasolina {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        
        // Contadores para cada tipo de combustível
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        /*
         * Loop while: continua enquanto o código for diferente de 4
         * Código 4 é o código de encerramento
         */
        while (codigo != 4) {

            if (codigo == 1)
                alcool++;  // Incrementa contador de álcool

          else if (codigo == 2)
                gasolina++;  // Incrementa contador de gasolina

            else if (codigo == 3)
                diesel++;  // Incrementa contador de diesel

            // Lê o próximo código
            codigo = sc.nextInt();
        }

            System.out.println("MUITO OBRIGADO");

        System.out.println("alcool" + alcool);

        System.out.println("gasolina" + gasolina);

        System.out.println("diesel" + diesel);
        sc.close();
        }
}
