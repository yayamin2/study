package revisao;

public class SomarMaisDe20 {
    static void main(String[] args) {
        int soma = 0;
        int numero = 0;

        while (soma <= 20) {
            numero++;
            soma += numero;

            System.out.println(soma);

        }
    }
}
