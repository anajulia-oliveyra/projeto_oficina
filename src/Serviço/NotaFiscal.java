package Serviço;

import java.util.List;
import cliente.Cliente;
import cliente.Veiculo;
import Serviço.TipoServiço;
import estoque.Peca;

public class NotaFiscal {
    private Cliente cliente;
    private Veiculo veiculo;
    private List<TipoServiço> servicosRealizados;
    private List<Peca> pecasUtilizadas;
    private double total;

    public NotaFiscal(Cliente cliente, Veiculo veiculo, List<TipoServiço> servicos, List<Peca> pecas) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.servicosRealizados = servicos;
        this.pecasUtilizadas = pecas;
        calcularTotal();
    }

    private void calcularTotal() {
        total = 0.0;
        for (TipoServiço s : servicosRealizados) {
            total += s.getPreco();
        }
        for (Peca p : pecasUtilizadas) {
            total += p.getPreco();
        }
    }

    public double getTotal() {
        return total;
    }

    public String gerarResumo() {
        StringBuilder resumo = new StringBuilder();
        
        resumo.append("Nota Fiscal\n");
        resumo.append("Cliente: ").append(cliente.getNome()).append("\n");
        resumo.append("Veículo: ").append(veiculo.getModelo()).append(" - ").append(veiculo.getPlaca()).append("\n");
        
        resumo.append("Serviços realizados:\n");
        for (TipoServiço s : servicosRealizados) {
            resumo.append("- ").append(s.getDescricao()).append(" R$").append(s.getPreco()).append("\n");
        }
        resumo.append("Peças utilizadas:\n");
        for (Peca p : pecasUtilizadas) {
            resumo.append("- ").append(p.getNome()).append(" R$").append(p.getPreco()).append("\n");
        }
        resumo.append("Total a pagar: R$").append(total).append("\n");
        
        return resumo.toString();
    }
}
