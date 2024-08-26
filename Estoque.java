import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<String, Produto> produtos;

    public Estoque() {
        produtos = new HashMap<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.put(produto.getCodigo(), produto);
    }

    public void removerProduto(String codigo) {
        produtos.remove(codigo);
    }

    public Produto buscarProduto(String codigo) {
        return produtos.get(codigo);
    }

    public void atualizarQuantidade(String codigo, int quantidade) {
        Produto produto = produtos.get(codigo);
        if (produto != null) {
            produto.setQuantidade(quantidade);
        }
    }

    public void listarProdutos() {
        for (Produto produto : produtos.values()) {
            System.out.println(produto);
        }
    }
}
