package AulasRocketSeat.Produto;

public class Produto {
    String nome;
    double preco;
    int quantidadeEstoque;

    void exibirInformacoes() {
        System.out.println(nome);
        System.out.println(preco);
        System.out.println(quantidadeEstoque);
    }

    void alterarNome(String novoNome) {
        nome = novoNome;
    }
    double calculadorValorTotalEmEstoque() {
        return preco * quantidadeEstoque;
    }
}
