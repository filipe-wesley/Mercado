/*
    Classe filha de Pedido

    HERANÇA + POLIMORFISMO
*/

public class PedidoExpress extends Pedido {

    public PedidoExpress(
            Cliente cliente,
            Carrinho carrinho
    ) {

        super(cliente, carrinho);
    }

    /*
        Sobrescrevendo taxa de entrega
        para entrega expressa.
    */
    @Override
    public double calcularTaxaEntrega() {

        return 30.0;
    }
}