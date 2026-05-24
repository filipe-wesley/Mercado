/*
    Classe principal

    Aqui executamos todo o sistema.
*/

public class Main {

    public static void main(String[] args) {

        // Produtos
        Produto arroz =
                new ProdutoAlimenticio(
                        "Arroz",
                        30,
                        5
                );

        Produto feijao =
                new ProdutoAlimenticio(
                        "Feijão",
                        15,
                        2
                );

        Produto celular =
                new ProdutoEletronico(
                        "Celular",
                        2000,
                        150
                );

        // Cliente
        Cliente cliente =
                new Cliente(
                        "Filipe",
                        "Rua A, 123"
                );

        // Carrinho
        Carrinho carrinho =
                new Carrinho();

        // Adicionando produtos
        carrinho.adicionarProduto(arroz);
        carrinho.adicionarProduto(feijao);
        carrinho.adicionarProduto(celular);

        /*
            POLIMORFISMO

            Pedido recebe PedidoExpress.
        */
        Pedido pedido =
                new PedidoExpress(
                        cliente,
                        carrinho
                );

        // Exibe pedido
        pedido.gerarResumo();
    }
}