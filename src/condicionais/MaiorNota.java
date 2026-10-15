package condicionais;

public class MaiorNota {
    static void main(String[] args) {

        double [] notas = new double[5];

        notas [0] = 8.5;
        notas [1] = 9.0;
        notas [2] = 6.0;
        notas [3] = 5.5;
        notas [4] = 7.0;

        double maior = notas [0];

        for (int  i =0; i < 5; i++) {
            if (notas [i] > maior) {
                maior = notas [i];
            }
        }
        System.out.println(maior);

    }
}
