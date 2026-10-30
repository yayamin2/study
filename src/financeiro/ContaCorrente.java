package financeiro;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ContaCorrente {
      private int numeroConta;
      private int numeroAgencia;
      private String nomeTitular;
      private BigDecimal saldo;
      private LocalDate dataNascimento;

    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public String getNomeTitular() {
        return nomeTitular;
    }
    }
