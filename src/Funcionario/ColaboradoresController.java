package funcionario;

import funcionario.Administrador;
import funcionario.Colaborador;
import funcionario.Mecanico;

public class ColaboradoresController {
     public void acessarAgenda(Colaborador f){
        f.acessarAgenda();
    }

    public void realizarAgendamento(Colaborador f){
        f.realizarAgendamento();
    }

    public void mostrarDados(Colaborador f){
        System.out.println(f);
    }

    public void executarAcoesEspecificas(Colaborador f){
        if(f instanceof Administrador){
            Administrador a = (Administrador) f;
            a.gerarBalançoMensal();
            a.gerarRelatorioDespesas();
            a.gerarNotaFiscal();
            a.adicionarUsuario();

        } else if(f instanceof Mecanico){
            Mecanico m = (Mecanico) f;
            m.criarListaServiço();
            m.atualizarStatusVeiculo();
            m.gerarRelatorioInspecao();

        } else {
            System.out.println(f.getNome() + " é atendente, não tem ações específicas.");
        }
    }
}

