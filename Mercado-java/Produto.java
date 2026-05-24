/*
    Classe abstrata Produto

    Serve como classe mãe para todos os produtos.
    Utilizamos HERANÇA para reutilizar atributos e métodos.
*/

public abstract class Produto {

    // protected permite acesso pelas classes filhas
    protected String nome;
    protected double preco;

    // Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Getter do nome
    public String getNome() {
        return nome;
    }

    // Getter do preço
    public double getPreco() {
        return preco;
    }

    /*
        Método abstrato

        O POLIMORFISMO acontece aqui:
        cada produto calcula o preço de forma diferente.
    */
    public abstract double calcularPrecoFinal();

    // Método comum para exibir produto
    public void exibirProduto() {

        System.out.println(
            nome + " - R$" + calcularPrecoFinal()
        );
    }
}