package revisao;

public class Triangulo {
    static void main(String[] args) {

        // Laço de fora: conta as LINHAS (de 1 até 4)
        for (int linha = 1; linha <= 4; linha++) {

            // Laço de dentro: desenha os ASTERISCOS de cada linha
            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.print("*"); // print SEM o "ln" pra desenhar na mesma linha
            }
            System.out.println(); // Pula linha para a próxima linha
        }
    }
}
