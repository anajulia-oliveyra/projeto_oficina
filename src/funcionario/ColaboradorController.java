/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;

/**
 *
 * @author ADM
 */
public class ColaboradorController {
     public void acessarAgenda(Colaboradores f){
        f.acessarAgenda();
    }
    
    public void realizarAgendamneto(Colaboradores f){
        f.realizarAgendamento();
    }
    
    public void mostrarDados(Colaboradores f){
        System.out.println(f);
    }
    
    public void executarAcoesExpecificas(Colaboradores f){
        if(f instanceof Administrador){
            Administrador a = (Administrador) f;
            a.gerarBalançoMensal();
            a.gerarRelatorioDespesas();
            a.gerarNotaFiscal();
            a.adicionarUsuario();
            
        }
        else if(f instanceof Mecanico){
            Mecanico m = (Mecanico) f;
            m.criarListaServiço();
            m.atualizarStatusVeiculo();
            m.gerarRelatorioInspecao();
            
        }
        else if(f instanceof Colaboradores){
            System.out.println(f.getNome() + " e atendente, nao tem acoes especificas.");
        }
        else{
            System.out.println("Funcionario não cadastrado");
        }
    }
    

}
