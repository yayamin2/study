package ContaCorrente;

import java.math.BigDecimal;
import java.time.LocalDate;
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

        public BigDecimal getSaldo() {
            return saldo;
        }

        public void setSaldo(BigDecimal saldo) {
            this.saldo = saldo;
        }

        public LocalDate getDataNascimento() {
            return dataNascimento;
        }

        public void setDataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
        }

        public int getNumeroAgencia() {
            return numeroAgencia;
        }

        public void setNumeroAgencia(int numeroAgencia) {
            this.numeroAgencia = numeroAgencia;
        }

        public void setNomeTitular(String nomeTitular) {
            this.nomeTitular = nomeTitular;
        }

        public void sacar(BigDecimal valorSaque) {
            if (valorSaque.compareTo(BigDecimal.ZERO) <= 0) {
                System.out.println("Valor inválido!");
            } else if (saldo.compareTo(valorSaque) < 0) {
                System.out.println("Saldo insuficiente!");
            } else {
                saldo = saldo.subtract(valorSaque);
            }
        }

    }
