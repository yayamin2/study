package revisao;

public class ContarPares {
    static void main(String[] args) {

        int[] v = {3, 8, 12, 5, 6, 7};

        int contador = 0;

        // For-Each: "Para cada 'num' dentro do vetor 'v'..."
        for (int num : v) {

            // Se o número for par (resto da divisão por 2 for igual a 0)
            if (num % 2 == 0) {
                // Adiciona 1 no nosso contador! (contador++ significa "soma 1")
                contador++;
            }
        }

        System.out.println("Quantidade de números pares: " + contador);
    }
}