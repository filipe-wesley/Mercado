/*
    Classe Pedido

    Implementa interface Entregavel.
*/

public class Pedido implements Entregavel {

    protected Cliente cliente;
    protected Carrinho carrinho;

    public Pedido(
            Cliente cliente,
            Carrinho carrinho
    ) {

        this.cliente = cliente;
        this.carrinho = carrinho;
    }

    /*
        Implementação da interface
    */
    @Override
    public double calcularTaxaEntrega() {

        return 15.0;
    }

    // Valor final
    public double calcularValorFinal() {

        return carrinho.calcularTotal()
                + calcularTaxaEntrega();
    }

    // Resumo do pedido
    public void gerarResumo() {

        System.out.println("\n===== PEDIDO =====");

        System.out.println(
            "Cliente: " + cliente.getNome()
        );

        System.out.println(
            "Endereço: " + cliente.getEndereco()
        );

        carrinho.listarProdutos();

        System.out.println(
            "\nTaxa entrega: R$"
            + calcularTaxaEntrega()
        );

        System.out.println(
            "Valor final: R$"
            + calcularValorFinal()
        );
    }
}