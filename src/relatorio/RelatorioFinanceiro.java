<<<<<<< HEAD:src/relatorio/RelatorioFinanceiro.java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relatorio;

/**
 *
 * @author ADM
 */
public class RelatorioFinanceiro {
    
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import model.Agendamento;
import java.util.ArrayList;
import java.util.List;

public class agendamentoRepository {
    private List<Agendamento> agendamentos = new ArrayList<>();
    
    public void adicionarAgendamento(Agendamento agendamento){
        agendamentos.add(agendamento);
    }
    
    public List<Agendamento> listarAgendamento(){
        return agendamentos;
    }
    
    public List<Agendamento> listarPorFuncionario(String nomeFuncionario){
        List<Agendamento> resultado = new ArrayList<>();
        for(Agendamento a : agendamentos){
            if(a.getFuncionario().getNome().equalsIgnoreCase(nomeFuncionario)){
                resultado.add(a);
            }
        }
        return resultado;
    }
}
>>>>>>> 63baafe6ad1af68a8a7dd0177871389df5aeec5e:src/repository/agendamentoRepository.java
