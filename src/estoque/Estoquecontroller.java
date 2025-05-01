package estoque;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Estoquecontroller{
    private List<Peca>pecas;
    
    public Estoquecontroller(){
        pecas = new ArrayList<>();
    }

    public void adicionarPeca(Peca peca) {
        pecas.add(peca);
    }

    public List<Peca> listarPecas() {
        return pecas;
    }

    public Peca buscarPecaPorCodigo(String codigo) {
        for (Peca peca : pecas) {
            if (peca.getCodigo().equals(codigo)) {
                return peca;
            }
        }
        return null;
    }

    public void carregarPecasDoJSON(String caminho) throws IOException {
        FileReader reader = new FileReader(new File(caminho));
        StringBuilder jsonStr = new StringBuilder();
        int i;
        while ((i = reader.read()) != -1) {
            jsonStr.append((char) i);
        }

        JSONArray pecasJson = new JSONArray(jsonStr.toString());
        for (int j = 0; j < pecasJson.length(); j++) {
            JSONObject pecaJson = pecasJson.getJSONObject(j);
            Peca peca = new Peca(
                    pecaJson.getString("codigo"),
                    pecaJson.getString("nome"),
                    pecaJson.getDouble("preco"),
                    pecaJson.getInt("estoque")
            );
            adicionarPeca(peca);
        }

        reader.close();
    }

    public void salvarPecasEmJSON(String caminho) throws IOException {
        JSONArray pecasJson = new JSONArray();
        for (Peca peca : pecas) {
            JSONObject pecaJson = new JSONObject();
            pecaJson.put("codigo", peca.getCodigo());
            pecaJson.put("nome", peca.getNome());
            pecaJson.put("preco", peca.getPreco());
            pecaJson.put("estoque", peca.getEstoque());
            pecasJson.put(pecaJson);
        }

        FileWriter writer = new FileWriter(new File(caminho));
        writer.write(pecasJson.toString());
        writer.close();
    }
}