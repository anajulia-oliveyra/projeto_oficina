package Main;

import Agenda.agenda;
import Agenda.Agendamento;

import java.time.LocalDateTime;

public class Main{
    public static void main(String[] args){
        agenda minhaAgenda = new agenda();

        LocalDateTime inicio1 = LocalDateTime.of(2025, 5, 4, 8, 0);
        LocalDateTime fim1 = LocalDateTime.of(2025, 5, 4, 9, 0);
        minhaAgenda.agendar(inicio1, fim1, "alinhamento", 100.00);

        LocalDateTime inicio2 = LocalDateTime.of(2025, 5, 4, 9, 0);
        LocalDateTime fim2 = LocalDateTime.of(2025, 5, 4, 10, 0);
        minhaAgenda.agendar(inicio2, fim2, "balanceamento", 120.00);

        LocalDateTime inicio3 = LocalDateTime.of(2025, 5, 4, 8, 30);
        LocalDateTime fim3 = LocalDateTime.of(2025, 5, 4, 9, 30);
        minhaAgenda.agendar(inicio3, fim3, "balanceamento", 130.00);

        minhaAgenda.listarAgendamentos();

        minhaAgenda.cancelarAgendamento(inicio1, 0);

        minhaAgenda.listarAgendamentos();
    }
}