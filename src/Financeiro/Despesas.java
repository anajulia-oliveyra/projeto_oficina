package Financeiro;

import org.json.JSONObject;
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

    public double getValor(){ return valor; }
    public String getDescricao(){ return descricao; }
    public LocalDate getData(){ return data; }

    public JSONObject toJSON() {
        JSONObject obj = new JSONObject();
        obj.put("descricao", descricao);
        obj.put("valor", valor);
        obj.put("data", data.toString());
        return obj;
    }

    public static Despesas fromJSON(JSONObject obj) {
        String descricao = obj.getString("descricao");
        double valor = obj.getDouble("valor");
        LocalDate data = LocalDate.parse(obj.getString("data"));
        return new Despesas(descricao, valor, data);
    }
}
