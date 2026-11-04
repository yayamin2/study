package POO.Produto;

public class Main {
    static void main(String[] args) {
        Produto a = new Produto();
        a.setNome("Caneta");
        a.setPreco(5.00);

        Produto b = new Produto();
        b.setNome("Caderno");
        b.setPreco(20.00);
        System.out.printf("%s: %.2f%n", a.getNome(), a.getPreco());
        System.out.printf("%s: %.2f%n", b.getNome(), b.getPreco());

        a.setPreco(7.50);
        System.out.printf ("Apos alterar a caneta: %.2f%n", a.getPreco());
        System.out.printf("Caderno permanece: %.2f%n", a.getPreco());

        a.setPreco(-2.00);
        System.out.printf("Após preço negativo: %.2f%n", a.getPreco());
    }
}