
package view;
import controller.PecaController;
import model.Peça;

import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Ana Julia Oliveira e Ana Carolina Pereira
 */
public class EstoqueView {
    private PecaController pecaController;
    private Scanner scanner;

    public PecaView() {
        this.pecaController = new PecaController();
        this.scanner = new Scanner(System.in);
    }
    
    public void exibirMenu() {
        while (true) {
            System.out.println("\n--- Menu de Estoque de Peças ---");
            System.out.println("1. Adicionar Peça");
            System.out.println("2. Listar Peças");
            System.out.println("3. Atualizar Peça");
            System.out.println("4. Remover Peça");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    adicionarPeca();
                    break;
                case 2:
                    listarPecas();
                    break;
                case 3:
                    atualizarPeca();
                    break;
                case 4:
                    removerPeca();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private void adicionarPeca() {
        System.out.print("Nome da Peça: ");
        String nome = scanner.nextLine();
        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();
        System.out.print("P1reço: ");
        double preco = scanner.nextDouble();
        pecaController.adicionarPeca(nome, quantidade, preco);
        System.out.println("Peça adicionada com sucesso!");
    }

    private void listarPecas() {
        List<Peça> pecas = pecaController.listarPecas();
        if (pecas.isEmpty()) {
            System.out.println("Nenhuma peça cadastrada.");
        } else {
            System.out.println("\n--- Lista de Peças ---");
            for (Peça peca : pecas) {
                System.out.println(peca);
            }
        }
    }

    private void atualizarPeca() {
        System.out.print("ID da Peça a ser atualizada: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        System.out.print("Novo Nome da Peça: ");
        String nome = scanner.nextLine();
        System.out.print("Nova Quantidade: ");
        int quantidade = scanner.nextInt();
        System.out.print("Novo Preço: ");
        double preco = scanner.nextDouble();

        Peça peca = new Peça(id, nome, quantidade, preco);
        pecaController.atualizarPeca(peca);
        System.out.println("Peça atualizada com sucesso!");
    }

    private void removerPeca() {
        System.out.print("ID da Peça a ser removida: ");
        int id = scanner.nextInt();
        pecaController.removerPeca(id);
        System.out.println("Peça removida com sucesso!");
    }
}

