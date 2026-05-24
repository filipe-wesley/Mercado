/*
    Classe filha de Produto
*/

public class ProdutoEletronico extends Produto {

    private double taxaGarantia;

    public ProdutoEletronico(
            String nome,
            double preco,
            double taxaGarantia
    ) {

        super(nome, preco);

        this.taxaGarantia = taxaGarantia;
    }

    /*
        Cada produto possui regra diferente
        para calcular valor final.
    */
    @Override
    public double calcularPrecoFinal() {

        return preco + taxaGarantia;
    }
}