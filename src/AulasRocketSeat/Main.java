package AulasRocketSeat;

public class Main {
    static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Iphone 17 pro max";
        produto1.preco = 10000.00;
        produto1.quantidadeEstoque = 10;
        produto1.alterarNome("Iphone 17 pro max ultra");

        Produto produto2 = new Produto();
        produto2.nome = "Secador de cabelo";
        produto2.preco = 200.00;
        produto2.quantidadeEstoque = 50;

        Produto produto3 = new Produto();
        produto3.nome = "Cafeteira";
        produto3.preco = 300.00;
        produto3.quantidadeEstoque = 20;

        produto1.exibirInformacoes();
        produto2.exibirInformacoes();
        produto3.exibirInformacoes();

        double resultado = produto1.calculadorValorTotalEmEstoque();
        System.out.println("Valor total em estoque do produto 1: " + resultado);

        double resultado2 = produto2.calculadorValorTotalEmEstoque();
        System.out.println("Valor total em estoque do produto 2: " + resultado2);

        double resultado3 = produto3.calculadorValorTotalEmEstoque();
        System.out.println("Valor total em estoque do produto 3: " + resultado3);


    }
}
