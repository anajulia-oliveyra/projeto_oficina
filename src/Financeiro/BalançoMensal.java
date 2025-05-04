package Financeiro;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class BalançoMensal {
    private List<Receitas> receitas;
    private List<Despesas> despesas;

    public BalançoMensal(List<Receitas> receitas, List<Despesas> despesas){
        this.receitas = receitas;
        this.despesas = despesas;
    }

    public double getTotalReceitas() {
        double total = 0;
        for (Receitas r : receitas) {
            total += r.getValor();
     
        return total;
    }

    public double getTotalDespesas() {
        double total = 0;
        for (Despesas d : despesas) {
            total += d.getValor();
        }
        return total;
    }

    public double getSaldoFinal() {
        return getTotalReceitas() - getTotalDespesas();
    }

    public void gerarRelatorio() {
        System.out.println("RELATÓRIO MENSAL COMPLETO");
        System.out.println("Total de receitas: R$ " + getTotalReceitas());
        System.out.println("Total de despesas: R$ " + getTotalDespesas());
        System.out.println("Saldo final: R$ " + getSaldoFinal());
        System.out.println();
    }

    public void gerarRelatorioPorPeriodo(LocalDate inicio, LocalDate fim) {
        double totalReceitas = 0;
        double totalDespesas = 0;

        for (Receitas r : receitas) {
            if (!r.getData().isBefore(inicio) && !r.getData().isAfter(fim)) {
                totalReceitas += r.getValor();
            }
        }

        for (Despesas d : despesas) {
            if (!d.getData().isBefore(inicio) && !d.getData().isAfter(fim)) {
                totalDespesas += d.getValor();
            }
        }

        double saldo = totalReceitas - totalDespesas;

        System.out.println("RELATÓRIO DE " + inicio + " ATÉ " + fim);
        System.out.println("Total de receitas: R$ " + totalReceitas);
        System.out.println("Total de despesas: R$ " + totalDespesas);
        System.out.println("Saldo final: R$ " + saldo);
        System.out.println();
    }
}