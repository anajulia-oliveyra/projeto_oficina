package Serviço;

import Serviço.StatusDoServico;
import java.util.ArrayList;
import java.util.List;

public class ServicoController {
    private List<StatusDoServico> servicos = new ArrayList<>();
    
    public void adicionarServico(String descricao, double preco){
        StatusDoServico servico = new StatusDoServico(descricao, preco);
        servicos.add(servico);
    }
    
    public List<StatusDoServico> listarServico(){
        return servicos;
    }
    
    public StatusDoServico buscarServico(String descricao){
        for(StatusDoServico s : servicos){
            if(s.getDescricao().equalsIgnoreCase(descricao)){
                return s;
            }
        }
        return null;
    }
    
    public boolean atualizarStatus(String descricao, StatusDoServico.Status novoStatus) {
    StatusDoServico servico = buscarServico(descricao);
    if (servico != null) {
        servico.setStatus(novoStatus);
        return true;
    }
    return false;
    }
    
    public void exibirStatusServico(StatusDoServico servico){
        System.out.println("Status do servico: " + servico.toString());
    }
}
