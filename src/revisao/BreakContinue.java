package revisao;

public class BreakContinue {
    static void main(String[] args) {

        // 1. Percorra de 1 a 20: Use continue para pular os ímpares e break para parar quando passar de 10
        for (int i = 1; i <= 20; i++) {

            // Se o número for maior que 10, PARA TUDO e sai do laço!
            if (i > 10) {
                break;
            }

            // Se o resto da divisão por 2 não for 0 (for ímpar), PULA esta volta!
            if (i % 2 != 0) {
                continue;
            }

            System.out.print(i + " ");
        }

    }
}