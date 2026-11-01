package revisao;

public class Fatorial {
    static void main(String[] args) {
        int num = 5; // O número que  quero calcular o fatorial
        int n = 1;   // O acumulador

        for (int i = 2; i <= num; i++) {
            n *= i;
            System.out.println(n);
        }
    }
}
