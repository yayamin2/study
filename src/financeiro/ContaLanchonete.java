package financeiro;

import java.util.Locale;
import java.util.Scanner;

public class ContaLanchonete {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        double preco = 0;
        int quantidade = sc.nextInt();
        double total = 0;

        if (codigo ==1){
            total = quantidade *4.00;}

        else if (codigo ==2){
            total = quantidade *4.50;}

        else if (codigo == 3){
            total = quantidade * 5.00;}

        else if (codigo ==4) {
            total = quantidade * 2.00;}

        else if (codigo ==5) {
            total = quantidade * 1.50;}

        System.out.printf("total R$ %.2f%n", total);
        }
    }


