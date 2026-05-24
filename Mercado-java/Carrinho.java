import java.util.ArrayList;
import java.util.List;

/*
    Classe Carrinho

    ASSOCIÇÃO:
    um carrinho possui vários produtos.
*/

public class Carrinho {

    // Lista de produtos
    private List<Produto> produtos;

    public Carrinho() {

        produtos = new ArrayList<>();
    }

    // Adiciona produto
    public void adicionarProduto(Produto produto) {

        produtos.add(produto);

        System.out.println(
            produto.getNome()
            + " adicionado ao carrinho!"
        );
    }

    // Calcula total
    public double calcularTotal() {

        double total = 0;

        /*
            POLIMORFISMO:
            cada produto executa sua própria
            versão do método calcularPrecoFinal()
        */
        for (Produto produto : produtos) {

            total += produto.calcularPrecoFinal();
        }

        return total;
    }

    // Lista produtos
    public void listarProdutos() {

        System.out.println("\n=== CARRINHO ===");

        for (Produto produto : produtos) {

            produto.exibirProduto();
        }
    }
}