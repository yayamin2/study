package AulasRocketSeat.Fundamentos.MetodoPrivado;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (validarValor(valor)) {
            saldo += valor;
            registrarOperacao("Depósito", valor);
        } else {
            System.out.println("Erro: Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (!validarValor(valor)) {
            System.out.println("Erro: Valor de saque inválido.");
            return;
        }

        if (!temSaldoSuficiente(valor)) {
            System.out.println("Erro: Saldo insuficiente para sacar R$ " + valor);
            return;
        }

        saldo -= valor;
        registrarOperacao("Saque", valor);
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular + " | Saldo atual: R$ " + saldo);
    }

    // --- MÉTODOS PRIVADOS (Uso exclusivo dentro desta classe) ---

    private boolean validarValor(double valor) {
        return valor > 0;
    }

    private boolean temSaldoSuficiente(double valor) {
        return saldo >= valor;
    }

    private void registrarOperacao(String tipo, double valor) {
        System.out.println(tipo + " de R$ " + valor + " realizado com sucesso!");
    }
}