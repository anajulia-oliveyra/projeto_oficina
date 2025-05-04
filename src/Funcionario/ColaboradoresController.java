package Funcionario;

import funcionario.Administrador;
import funcionario.Colaboradores;
import funcionario.Mecanico;

public class ColaboradoresController {
     public void acessarAgenda(Colaboradores f){
        f.acessarAgenda();
    }

    public void realizarAgendamento(Colaboradores f){
        f.realizarAgendamento();
    }

    public void mostrarDados(Colaboradores f){
        System.out.println(f);
    }

    public void executarAcoesEspecificas(Colaboradores f){
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

