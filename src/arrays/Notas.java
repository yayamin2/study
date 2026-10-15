package arrays;

public class Notas {
    static void main() {

        double [] notas = new double[5];
        double soma =0;

        notas [0] = 8.5;
        notas [1] = 9.0;
        notas [2] = 6.0;
        notas [3] = 5.5;
        notas [4] = 7.0;

        for (int  i =0; i <5; i++) {
            soma = soma + notas [i];
        }
        System.out.println( "Soma das notas: " +soma );

        double media = soma/5;
        System.out.println ("Média do aluno: " + media);

    }
}
