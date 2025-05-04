package Financeiro;

import Financeiro.BalançoMensal;
import Financeiro.Despesas;
import Financeiro.Receitas;
import Financeiro.financeiroController;
import java.util.ArrayList;
import java.util.List;

public class financeiroView {
        private financeiroController controller;
        
        public financeiroView(financeiroController controller){
            this.controller = controller;
        }
        
        public void mostrarBalancoMensal(){
            BalançoMensal balanco = controller.gerarBalanço();
            
            System.out.println("RELATÓRIO MENSAL COMPLETO");
            System.out.println("Total de receitas: R$ " + balanco.getTotalReceitas());
            System.out.println("Total de despesas: R$ " + balanco.getTotalDespesas());
            System.out.println("Saldo final: R$ " + balanco.getSaldoFinal());
            System.out.println();
    }
        
        public void mostrarTodasDespesas(){           
            for(Despesas despesas : despesas){
                System.out.println("Descricao: " + despesas.getDescricao());
                System.out.println("Valor R$ " + despesas.getValor());
}
            
        public void mostrarTodasReceitas(){
            for(Receitas receitas : receitas){
                System.out.println("Descricao: " + receitas.getDescricao());
                System.out.println("Valor R$ " + receitas.getValor());
}
       }
}
