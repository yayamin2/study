package basico;

import java.util.Scanner;

public class ConversorSegundosEmHoras {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os segundos: ");
        int totalSegundos = sc.nextInt();

        int horas = totalSegundos / 3600;
        int sobram = totalSegundos % 3600;
        int minutos = sobram / 60;
        int segundos = sobram % 60;

        System.out.println(horas + "h "+ minutos + "min " +segundos + "s ");

    }
}
