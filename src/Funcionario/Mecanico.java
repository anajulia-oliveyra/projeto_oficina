package funcionario;

import Agenda.agenda;

public class Mecanico extends Colaboradores {
    
    public Mecanico(int id, String nome, String cpf, String cargo, agenda agenda){
        super(id, nome, cpf, cargo, agenda);
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
