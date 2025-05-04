package Agenda;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class agenda {
    private List<AgendaController> agendamentos;

    public agenda() {
        this.agendamentos = new ArrayList<>();
    }

    public boolean agendar(LocalDateTime inicio, LocalDateTime fim, String tipoServico, double valorPago) {
        int elevadorDisponivel = buscarElevadorDisponivel(inicio, fim, tipoServico);
        if (elevadorDisponivel == -1) {
            System.out.println("Nenhum elevador disponível para este horário.");
            return false;
        }

        AgendaController novo = new AgendaController(inicio, fim, tipoServico, elevadorDisponivel, valorPago);
        agendamentos.add(novo);
        System.out.println("Agendamento realizado no elevador " + elevadorDisponivel);
        return true;
    }

    public int buscarElevadorDisponivel(LocalDateTime inicio, LocalDateTime fim, String tipoServico) {
        int[] idsValidos = tipoServico.equalsIgnoreCase("alinhamento") ? new int[]{0} : new int[]{1, 2};

        for (int id : idsValidos) {
            boolean ocupado = false;
            for (AgendaController ag : agendamentos) {
                if (!ag.isCancelado() && ag.getIdElevador() == id && ag.conflitaCom(inicio, fim)) {
                    ocupado = true;
                    break;
                }
            }
            if (!ocupado) return id;
        }
        return -1;
    }

    public boolean cancelarAgendamento(LocalDateTime inicio, int idElevador) {
        for (AgendaController ag : agendamentos) {
            if (!ag.isCancelado() && ag.getInicio().equals(inicio) && ag.getIdElevador() == idElevador) {
                double reembolso = ag.cancelar();
                System.out.println("Agendamento cancelado. Reembolso ao cliente: R$" + reembolso);
                return true;
            }
        }
        System.out.println("Agendamento não encontrado.");
        return false;
    }

    public void listarAgendamentos() {
        if (agendamentos.isEmpty()) {
            System.out.println("Nenhum agendamento cadastrado.");
        } else {
            for (AgendaController ag : agendamentos) {
                System.out.println(ag);
            }
        }
    }
}
