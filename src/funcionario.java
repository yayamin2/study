import java.util.Locale;
import java.util.Scanner;

public class funcionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);

        System.out.println("Digite o número do funcionario: ");
        int numeroFuncionario = sc.nextInt();

        System.out.println("Digite quantidade de horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        System.out.println("Digite o valor da hora: ");
        double valorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorHora;

        System.out.printf ("numero do funcioario:  %d%n ", numeroFuncionario);

        System.out.printf("O salario é: %.2f%n ", salario);
    }
}
