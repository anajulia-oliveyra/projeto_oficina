package Financeiro;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class financeiroController {
    private List<Despesas> despesas = new ArrayList<>();
    private List<Receitas> receitas = new ArrayList<>();

    public void adicionarDespesa(Despesas despesa) {
        despesas.add(despesa);
    }

    public void adicionarReceitas(Receitas receita) {
        receitas.add(receita);
    }

    public BalançoMensal gerarBalanço() {
        return new BalançoMensal(receitas, despesas); // ordem corrigida
    }

    public List<Despesas> listarDespesas() {
        return despesas;
    }

    public List<Receitas> listarReceitas() {
        return receitas;
    }

    public void salvarFinanceiro(String caminho) throws IOException {
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

    public void carregarFinanceiro(String caminho) throws IOException {
        String conteudo = Files.readString(Paths.get(caminho));
        JSONObject obj = new JSONObject(conteudo);

        receitas.clear();
        for (Object o : obj.getJSONArray("receitas")) {
            receitas.add(Receitas.fromJSON((JSONObject) o));
        }

        despesas.clear();
        for (Object o : obj.getJSONArray("despesas")) {
            despesas.add(Despesas.fromJSON((JSONObject) o));
        }
    }
}
