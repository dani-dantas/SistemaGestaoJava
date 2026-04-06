import java.util.Scanner;

public class SistemaGestao {
    private Estoque estoque;
    private Scanner scanner;

    public SistemaGestao() {
        estoque = new Estoque();
        scanner = new Scanner(System.in);
    }

    private int lerInteiro(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        }
    }

    private double lerDouble(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                return Double.parseDouble(scanner.nextLine().trim().replace(",", "."));
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
            }
        }
    }

    public void menuPrincipal() {
        while (true) {
            System.out.println("\nSistema de Gestão de Estoque - Marizardo Moto Peças");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Atualizar Quantidade");
            System.out.println("4. Buscar Produto");
            System.out.println("5. Listar Produtos");
            System.out.println("6. Sair");
            int escolha = lerInteiro("Escolha uma opção: ");

            switch (escolha) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    removerProduto();
                    break;
                case 3:
                    atualizarQuantidade();
                    break;
                case 4:
                    buscarProduto();
                    break;
                case 5:
                    listarProdutos();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void adicionarProduto() {
        System.out.print("Digite o código do produto: ");
        String codigo = scanner.nextLine().trim();

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine().trim();

        double preco = lerDouble("Digite o preço do produto: ");
        if (preco < 0) {
            System.out.println("Preço não pode ser negativo.");
            return;
        }

        int quantidade = lerInteiro("Digite a quantidade do produto: ");
        if (quantidade < 0) {
            System.out.println("Quantidade não pode ser negativa.");
            return;
        }

        estoque.adicionarProduto(new Produto(codigo, nome, preco, quantidade));
        System.out.println("Produto adicionado com sucesso!");
    }

    private void removerProduto() {
        System.out.print("Digite o código do produto a ser removido: ");
        String codigo = scanner.nextLine().trim();
        boolean removido = estoque.removerProduto(codigo);
        System.out.println(removido ? "Produto removido com sucesso!" : "Produto não encontrado.");
    }

    private void atualizarQuantidade() {
        System.out.print("Digite o código do produto: ");
        String codigo = scanner.nextLine().trim();

        int quantidade = lerInteiro("Digite a nova quantidade: ");
        if (quantidade < 0) {
            System.out.println("Quantidade não pode ser negativa.");
            return;
        }

        boolean atualizado = estoque.atualizarQuantidade(codigo, quantidade);
        System.out.println(atualizado ? "Quantidade atualizada com sucesso!" : "Produto não encontrado.");
    }

    private void buscarProduto() {
        System.out.print("Digite o código do produto: ");
        String codigo = scanner.nextLine().trim();
        Produto produto = estoque.buscarProduto(codigo);
        System.out.println(produto != null ? produto : "Produto não encontrado.");
    }

    private void listarProdutos() {
        System.out.println("Listagem de Produtos:");
        estoque.listarProdutos();
    }

    public static void main(String[] args) {
        SistemaGestao sistema = new SistemaGestao();
        sistema.menuPrincipal();
    }
}
