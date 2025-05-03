package relatorio;

public class RelatorioFinanceiro {
/*    import Agenda.agenda;
    import java.util.ArrayList;
    import java.util.List;

    public class agendamentoRepository {
        private List<Agenda> agendamentos = new ArrayList<>();

        public void adicionarAgendamento(Agenda agendamento){
            agendamentos.add(agendamento);
        }

        public List<Agenda> listarAgendamento(){
            return agendamentos;
        }

        public List<Agenda> listarPorFuncionario(String nomeFuncionario){
            List<Agenda> resultado = new ArrayList<>();
            for(Agenda a : agendamentos){
                if(a.getFuncionario().getNome().equalsIgnoreCase(nomeFuncionario)){
                    resultado.add(a);
                }
            }
            return resultado;
        }
    }
    }