/*
    Classe filha de Produto

    HERANÇA:
    ProdutoAlimenticio herda atributos da classe Produto.
*/

public class ProdutoAlimenticio extends Produto {

    private double desconto;

    public ProdutoAlimenticio(
            String nome,
            double preco,
            double desconto
    ) {

        // chama construtor da classe mãe
        super(nome, preco);

        this.desconto = desconto;
    }

    /*
        POLIMORFISMO

        Sobrescrevendo o método da classe mãe.
    */
    @Override
    public double calcularPrecoFinal() {

        return preco - desconto;
    }
}