package Funcionario;

import Agenda.agenda;

public class Mecanico extends Funcionario {
    
    public Mecanico(int id, String nome, String cargo, String cpf, agenda agenda){
        super(id, nome, cargo, cpf, agenda);
    }
    
    public void criarListaServiço(){
        System.out.println(getNome() + " criando lista de servico");
    }
    
    public void atualizarStatusVeiculo(){
        System.out.println(getNome() + " atualizando status do veiculo ");
    }
    
    public void gerarRelatorioInspecao(){
        System.out.println(getNome() + " gerando relatorio de inspecao");
    }
}
