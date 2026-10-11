package condicionais;

import java.util.Scanner;

public class PostoGasolina {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (codigo != 4) {

            if (codigo == 1)
                alcool++;

          else if (codigo == 2)
                gasolina++;

            else if (codigo == 3)
                diesel++;

            codigo = sc.nextInt();
        }

            System.out.println("MUITO OBRIGADO");

        System.out.println("alcool" + alcool);

        System.out.println("gasolina" + gasolina);

        System.out.println("diesel" + diesel);
        }
}
