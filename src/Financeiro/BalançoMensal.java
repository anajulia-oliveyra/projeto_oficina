package Financeiro;

public class BalançoMensal {
    private Float receitas;
    private Float despesas;
    
    public BalançoMensal(Float receitas, Float despesas){
        this.receitas = receitas;
        this.despesas = despesas;
    }
    
    public void gerarRelatorio(){
        System.out.println("");
    }
}
