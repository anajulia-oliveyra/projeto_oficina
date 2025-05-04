package Serviço;

import Serviço.StatusDoServiço.Status;
import Serviço.serviçoController;

import java.util.List;
import java.util.Scanner;

public class serviçoView {

    private serviçoController controller = new serviçoController();
    private Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println(" MENU SERVIÇOS ");
            System.out.println("1. Adicionar Serviço");
            System.out.println("2. Listar Serviços");
            System.out.println("3. Atualizar Status de Serviço");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> adicionarServico();
                case 2 -> listarServicos();
                case 3 -> atualizarStatus();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    private void adicionarServico() {
        System.out.print("Descrição do serviço: ");
        String descricao = scanner.nextLine();

        System.out.print("Preço do serviço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // limpar buffer

        controller.adicionarServico(descricao, preco);
        System.out.println("Serviço adicionado com sucesso!");
    }

    private void listarServicos() {
        List<StatusDoServiço> servicos = controller.listarServico();
        if (servicos.isEmpty()) {
            System.out.println("Nenhum serviço cadastrado.");
        } else {
            for (StatusDoServiço s : servicos) {
                System.out.println("Descrição: " + s.getDescricao());
                System.out.println("Preço: R$" + s.getPreco());
                System.out.println("Status: " + s.getStatus());
            }
        }
    }
    
    private void atualizarStatus() {
        System.out.print("Digite a descrição do serviço para atualizar o status: ");
        String descricao = scanner.nextLine();

        System.out.println("Escolha o novo status:");
        for (Status status : Status.values()) {
            System.out.println("- " + status);
        }
        System.out.print("Novo status: ");
        String novoStatusStr = scanner.nextLine();

        try {
            Status novoStatus = Status.valueOf(novoStatusStr.toUpperCase());
            boolean atualizado = controller.atualizarStatus(descricao, novoStatus);
            if (atualizado) {
                System.out.println("Status atualizado com sucesso.");
            } else {
                System.out.println("Serviço não encontrado.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Status inválido.");
        }
    }
}
