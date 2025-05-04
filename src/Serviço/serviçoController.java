package Serviço;

import Serviço.StatusDoServiço;
import java.util.ArrayList;
import java.util.List;

public class serviçoController {
    private List<StatusDoServiço> servicos = new ArrayList<>();
    
    public void adicionarServico(String descricao, double preco){
        StatusDoServiço servico = new StatusDoServiço(descricao, preco);
        servicos.add(servico);
    }
    
    public List<StatusDoServiço> listarServico(){
        return servicos;
    }
    
    public StatusDoServiço buscarServico(String descricao){
        for(StatusDoServiço s : servicos){
            if(s.getDescricao().equalsIgnoreCase(descricao)){
                return s;
            }
        }
        return null;
    }
    
    public boolean atualizarStatus(String descricao, String novoStatus){
        StatusDoServiço servico = buscarServico(descricao);
        if(servico != null){
            servico.setStatus(StatusDoServiço.Status.ENTREGUE);
            return true;
        }
        return false;
    }
    
    public void exibirStatusServico(StatusDoServiço servico){
        System.out.println("Status do servico: " + servico.toString());
    }
}
