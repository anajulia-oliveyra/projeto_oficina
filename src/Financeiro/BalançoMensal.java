package Financeiro;

public class BalançoMensal {
    private Receitas[] receitas;
    private Despesas[] despesas;
    
    public BalançoMensal(Receitas[] receitas, Despesas[] despesas){
        this.receitas = receitas;
        this.despesas = despesas;
    }
    
    public double getTotalReceitas(){
        double total = 0;
        for(Receitas receitas : receitas){
            total += receitas.getValor();
        }
        return total;
    }
    
    public double getTotalDespesas(){
        double total = 0;
        for(Despesas despesas : despesas){
            total += despesas.getValor();
        }
        return total;
    }
    
    public double getSaldoFinal(){
        return getTotalReceitas() - getTotalDespesas();
    }
    
    public void gerarRelatorio(){
        System.out.println("RELATORIO MENSAL");
        System.out.println("Total de receitas: R$ " + getTotalReceitas());
        System.out.println("Total de despesas: R$ " + getTotalDespesas());
        System.out.println("Saldo final: R$ " + getSaldoFinal());
        System.out.println();
    }
}
