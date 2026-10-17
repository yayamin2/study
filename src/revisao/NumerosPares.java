package revisao;

import java.util.Scanner;

public class NumerosPares {
    static void main(String[] args) {

        int[] numero = new int[8];
        int par =0;
        int soma=0;

        numero[0] = 8;
        numero[1] = 3;
        numero[2] = 6;
        numero[3] = 10;
        numero[4] = 2;
        numero[5] = 7;
        numero[6] = 5;
        numero[7] = 4;

        for (int i = 0; i <= 7; i++) {

            if (numero[i] % 2 == 0) {
            par = par +1;
            }
        }
        System.out.println (par);
    }
}