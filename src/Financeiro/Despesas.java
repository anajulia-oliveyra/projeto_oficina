package Financeiro;

import java.time.LocalDate;


public class Despesas {
    private String descricao;
    private double valor;
    private LocalDate data;
    
    public Despesas(String descricao, double valor, LocalDate data){
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }
    
    public double getValor(){
        return valor;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public LocalDate getData(){
        return data;
    }
}
