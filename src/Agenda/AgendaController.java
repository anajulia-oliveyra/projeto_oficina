package Agenda;
import java.time.LocalDateTime;

public class AgendaController {
  
    private LocalDateTime inicio;
    private LocalDateTime fim;
    private String tipoServico;
    private int idElevador;
    private double valorPago;
    private boolean cancelado = false;

    public AgendaController(LocalDateTime inicio, LocalDateTime fim, String tipoServico, int idElevador, double valorPago) {
        this.inicio = inicio;
        this.fim = fim;
        this.tipoServico = tipoServico;
        this.idElevador = idElevador;
        this.valorPago = valorPago;
    }

    public boolean conflitaCom(LocalDateTime novoInicio, LocalDateTime novoFim) {
        return !(novoFim.isBefore(this.inicio) || novoInicio.isAfter(this.fim));
    }

    public double cancelar() {
        cancelado = true;
        return valorPago * 0.80;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public int getIdElevador() {
        return idElevador;
    }

    public double getValorPago() {
        return valorPago;
    }

    @Override
    public String toString() {
        return "[Agendamento] Tipo: " + tipoServico +
                ", Elevador: " + idElevador +
                ", Início: " + inicio +
                ", Fim: " + fim +
                ", Valor: R$" + valorPago +
                (cancelado ? " [CANCELADO]" : "");
    }
}
