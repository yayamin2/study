package POO.Forca;

public class Forca {
    private String palavraSecreta; // Palavra que precisa descobrir
    private String palavraOculta; // Palavra que aparece na tela, com letras descobertas e "_"
    private int tentativas; // Quantidade de erros que o jogador ainda pode cometer

    public Forca(String palavra) {
        palavraSecreta = palavra.toLowerCase();
        ;
        tentativas = 6;

        palavraOculta = ""; // Começa com a palavra oculta vazia
        for (int i = 0; i < palavra.length(); i++) {
            char letralAtual = palavraSecreta.charAt(i);

            if (letralAtual == ' ') {
                palavraOculta = palavraOculta + " ";
            } else {
                palavraOculta = palavraOculta + "_";
            }

        }
    }

    public int getTentativas() { // ver quantas tentativas ainda tem
        return tentativas;
    }

    public void setTentativas(int novasTentativas) { // para alterar quantidade das tentativas
        tentativas = novasTentativas;
    }

    public String getPalavraOculta() {
        return palavraOculta;
    }
    public String getPalavraSecreta() {
        return palavraSecreta;
    }

    public boolean tentarLetra(char letra) {
        boolean acertou = false;
        String novaPalavraOculta = "";

        for (int i = 0; i < palavraSecreta.length(); i++) {

            if (palavraSecreta.charAt(i) == letra) {
                novaPalavraOculta = novaPalavraOculta + letra;
                acertou = true;

            } else {
                novaPalavraOculta = novaPalavraOculta + palavraOculta.charAt(i);
            }
        }

        palavraOculta = novaPalavraOculta;

        if (acertou == false) {
            tentativas--;
        }

        return acertou;
    }

    public boolean verificarVitoria() { //Verifica se ganhou
        for (int i = 0; i < palavraOculta.length(); i++) {
            if (palavraOculta.charAt(i) == '_') {
                return false;
            }
        }
        return true;
    }

    public boolean verificarDerrota() {
        if (tentativas <= 0) {
            return true;
        }
        return false;
    }
}
