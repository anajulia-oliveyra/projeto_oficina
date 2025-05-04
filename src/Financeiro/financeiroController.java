package Financeiro;

import Financeiro.BalançoMensal;
import Financeiro.Despesas;
import Financeiro.Receitas;
import java.util.ArrayList;
import java.util.List;

public class financeiroController {
    private List<Despesas> despesas = new ArrayList<>();
    private List<Receitas> receitas = new ArrayList<>();
        
    public void adicionarDespesa(Despesas despesa){
        despesas.add(despesa);
    }    
    
    public void adicionarReceitas(Receitas receita){
        receitas.add(receita);
    }
    
    public BalançoMensal gerarBalanço(){
        return new BalançoMensal(despesas, receitas);
    }
    
    public List<Despesas> listarDespesas(){
        return despesas;
    }
    
    public List<Receitas> listarReceitas(){
        return receitas;
    
    }
}