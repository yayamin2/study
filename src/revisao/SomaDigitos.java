package revisao;

public class SomaDigitos {
    static void main(String[] args) {
        int n;
        int soma =0;

        do {   soma += n % 10;
            n /= 10;

        } while (n > 0);

        System.out.println(soma);

    }
}
