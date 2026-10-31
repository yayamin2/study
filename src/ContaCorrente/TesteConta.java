package ContaCorrente;
import ContaCorrente.ContaCorrente;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TesteConta {

    static void main() {
        Scanner sc = new Scanner(System.in);
        ContaCorrente conta = new ContaCorrente();

        System.out.print("Digite o número da Conta: ");
        int numero = sc.nextInt();
        conta.setNumeroConta(numero);

        System.out.print("Digite o número da agencia:");
        int numeroAgencia = sc.nextInt();
        conta.setNumeroAgencia(numeroAgencia);

        sc.nextLine();
        System.out.print("Digite o nome do Titular: ");
        String nomeTitular = sc.nextLine();
        conta.setNomeTitular(nomeTitular);

        System.out.print("Digite o saldo:");
        BigDecimal saldo = new BigDecimal(sc.next());
        conta.setSaldo(saldo);


        System.out.print("Digite a data de nascimento (dd/MM/yyyy): ");
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataNascimento = LocalDate.parse(sc.next(), formato);
        conta.setDataNascimento(dataNascimento);

        System.out.println("Data recebida: " + dataNascimento);

        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Número da agencia: " + conta.getNumeroAgencia());
        System.out.println("Nome do Titular: " + conta.getNomeTitular());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Data de nascimento: " + conta.getDataNascimento());
    }
}