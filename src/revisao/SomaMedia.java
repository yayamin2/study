package revisao;

public class SomaMedia {
    static void main(String[] args) {
        int[] v = {10, 20, 30, 40, 50};
        int soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + (double) soma / v.length);
    }
}
