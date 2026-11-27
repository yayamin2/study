package AulasRocketSeat.Fundamentos.Operadores;

import java.util.Date;

public class Atribuicoes {
    static void main() {
        String nome = "Yasmin";
        int idade = 26;
        double salario = 2500.50;
        char sexo = 'F';
        boolean ativo = true;
        Date dataNascimento = new Date(2000, 03, 26);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Ativo: " + ativo);
        System.out.println("Data de Nascimento: " + dataNascimento);
    }
}
