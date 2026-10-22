package revisao;

/*
 * Exercício: Contagem Regressiva
 * Objetivo: Imprimir uma contagem regressiva de 10 até 1.
 * Conceitos: for loop com decremento.
 */
public class ContagemRegressiva {
    static void main(String[] args) {

        /*
         * for loop com decremento:
         * i começa em 10 e decrementa até 1
         * i-- é equivalente a i = i - 1
         */
        for (int i = 10; i >= 1; i--) {

            System.out.println(i);
        }
    }
}