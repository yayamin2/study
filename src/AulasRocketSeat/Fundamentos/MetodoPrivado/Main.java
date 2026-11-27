package AulasRocketSeat.Fundamentos.MetodoPrivado;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Yasmin", 1000.0);

        conta.exibirSaldo();

        conta.depositar(500.0);
        conta.sacar(200.0);

        conta.exibirSaldo();
    }
}
