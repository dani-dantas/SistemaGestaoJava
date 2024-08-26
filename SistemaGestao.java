import java.util.Scanner;

public class SistemaGestao {
    private Estoque estoque;
    private Scanner scanner;

    public SistemaGestao() {
        estoque = new Estoque();
        scanner = new Scanner(System.in);
    }

    public void menuPrincipal() {
        while (true) {
            System.out.println("Sistema de Gestão de Estoque - Marizardo Moto Peças");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Atualizar Quantidade");
            System.out.println("4. Buscar Produto");
            System.out.println("5. Listar Produtos");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();

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
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void adicionarProduto() {
        System.out.print("Digite o código do produto: ");
        String codigo = scanner.nextLine();
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.print("Digite a quantidade do produto: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        Produto produto = new Produto(codigo, nome, preco, quantidade);
        estoque.adicionarProduto(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    private void removerProduto() {
        System.out.print("Digite o código do produto a ser removido: ");
        String codigo = scanner.nextLine();
        estoque.removerProduto(codigo);
        System.out.println("Produto removido com sucesso!");
    }

    private void atualizarQuantidade() {
        System.out.print("Digite o código do produto: ");
        String codigo = scanner.nextLine();
        System.out.print("Digite a nova quantidade: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        estoque.atualizarQuantidade(codigo, quantidade);
        System.out.println("Quantidade atualizada com sucesso!");
    }

    private void buscarProduto() {
        System.out.print("Digite o código do produto: ");
        String codigo = scanner.nextLine();
        Produto produto = estoque.buscarProduto(codigo);
        if (produto != null) {
            System.out.println(produto);
        } else {
            System.out.println("Produto não encontrado.");
        }
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

