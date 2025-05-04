package Serviço;

public class TipoServico {
    private TipoServico tipo;
    private String descricao;
    private double preco;
    
    public TipoServico(TipoServico tipo, String descricao, double preco){
        this.tipo = tipo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public TipoServico getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }
    
    public String toString(){
        return "Serviço: " + tipo + 
                "\n Descricao: " + descricao +
                "\n Preco: R$" + preco;
    }
}
