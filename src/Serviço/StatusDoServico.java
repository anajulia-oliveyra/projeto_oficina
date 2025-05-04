package Serviço;

public class StatusDoServico {
    private String descricao;
    private double preco;
    private Status status;
    
    public StatusDoServico(String descricao, double preco){
        this.descricao = descricao;
        this.preco = preco;
        this.status = Status.AGENDADO;
    }
    
    public enum Status{
        AGENDADO,
        EM_EXECUCAO,
        CONCLUIDO,
        ENTREGUE
        
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }


    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "StatusDoServi\u00e7o{" + "status=" + status + '}';
    }
    
    
}
