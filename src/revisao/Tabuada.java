package revisao;

import java.util.Scanner;

public class Tabuada {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int N = sc.nextInt();


        for (int i =1; i<= 10; i++ ) {
            System.out.println (N * i);



        }



    }
}

