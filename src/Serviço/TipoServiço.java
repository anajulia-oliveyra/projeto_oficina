package Serviço;

public class TipoServiço {
    private TipoServiço tipo;
    private String descricao;
    private double preco;
    
    public TipoServiço(TipoServiço tipo, String descricao, double preco){
        this.tipo = tipo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public TipoServiço getTipo() {
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
