package Financeiro;

public class Receitas {
    private String descricao;
    private double valor;
    
    public Receitas(String descricao, double valor){
        this.descricao = descricao;
        this.valor = valor;
    }
    
    public double getValor(){
        return valor;
    }
    
    public String getDescricao(){
        return descricao;
    }
}
