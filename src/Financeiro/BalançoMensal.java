package Financeiro;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BalançoMensal {
    private List<Receitas> receitas;
    private List<Despesas> despesas;

    public BalançoMensal(List<Receitas> receitas, List<Despesas> despesas) {
        this.receitas = receitas;
        this.despesas = despesas;
    }

    public double getTotalReceitas() {
        return receitas.stream().mapToDouble(Receitas::getValor).sum();
    }

    public double getTotalDespesas() {
        return despesas.stream().mapToDouble(Despesas::getValor).sum();
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

    public void salvarEmArquivo(String caminho) throws IOException {
        JSONObject obj = new JSONObject();

        JSONArray receitasArray = new JSONArray();
        for (Receitas r : receitas) {
            receitasArray.put(r.toJSON());
        }

        JSONArray despesasArray = new JSONArray();
        for (Despesas d : despesas) {
            despesasArray.put(d.toJSON());
        }

        obj.put("receitas", receitasArray);
        obj.put("despesas", despesasArray);

        Files.writeString(Paths.get(caminho), obj.toString(2));
    }

    public static BalançoMensal carregarDeArquivo(String caminho) throws IOException {
        String conteudo = Files.readString(Paths.get(caminho));
        JSONObject obj = new JSONObject(conteudo);

        List<Receitas> receitas = new ArrayList<>();
        for (Object o : obj.getJSONArray("receitas")) {
            receitas.add(Receitas.fromJSON((JSONObject) o));
        }

        List<Despesas> despesas = new ArrayList<>();
        for (Object o : obj.getJSONArray("despesas")) {
            despesas.add(Despesas.fromJSON((JSONObject) o));
        }

        return new BalançoMensal(receitas, despesas);
    }
}
