package POO.Forca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Forca jogo = new Forca("Engenharia de software"); // Criar a palavra que será adivinhada

        System.out.println(" === JOGO DA FORCA === ");

        while (jogo.verificarVitoria() == false && jogo.verificarDerrota() == false) { /* Enquanto não perder ou ganhar
        o jogo continua */
            System.out.println("\nPalavra: " + jogo.getPalavraOculta());
            System.out.println("Tentativas restantes: " + jogo.getTentativas());

            System.out.print("Digite uma letra: ");
            String entrada = sc.nextLine();

            char letra = Character.toLowerCase(entrada.charAt(0));
            boolean acertou = jogo.tentarLetra(letra);

            if (acertou == true) {
                System.out.println("Você acertou a letra ");
            } else {
                System.out.println("Letra incorreta");

            }
        }
        System.out.println("\n -----------");

        if (jogo.verificarVitoria() == true) {
            System.out.println("Parabêns, você venceu o jogo");
            System.out.println("A palavra era: " + jogo.getPalavraSecreta());
        } else {
            System.out.println("Fim de jogo, você perdeu");
            System.out.println("A palavra era: " + jogo.getPalavraSecreta());
        }
        System.out.println(" -----------");
    }
}
