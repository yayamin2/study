package revisao;

public class MenorNumero {
    static void main(String[] args) {

        int[] numero = new int[6];

        numero[0] = 8;
        numero[1] = 9;
        numero[2] = 6;
        numero[3] = 10;
        numero[4] = 2;
        numero[5] = 7;

        int menor = numero[0];

        for (int i = 0; i < 6; i++) {
            if (numero[i] < menor) {
                menor = numero[i];
            }
        }
        System.out.println(menor);
    }
}