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

    public boolean removerProduto(String codigo) {
        return produtos.remove(codigo) != null;
    }

    public Produto buscarProduto(String codigo) {
        return produtos.get(codigo);
    }

    public boolean atualizarQuantidade(String codigo, int quantidade) {
        Produto produto = produtos.get(codigo);
        if (produto != null) {
            produto.setQuantidade(quantidade);
            return true;
        }
        return false;
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio.");
            return;
        }
        for (Produto produto : produtos.values()) {
            System.out.println(produto);
        }
    }
}
