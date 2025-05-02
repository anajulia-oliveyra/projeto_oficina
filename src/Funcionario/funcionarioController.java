package Funcionario;

public class funcionarioController {
    
    public void acessarAgenda(Funcionario f){
        f.acessarAgenda();
    }
    
    public void realizarAgendamneto(Funcionario f){
        f.realizarAgendamento();
    }
    
    public void mostrarDados(Funcionario f){
        System.out.println(f);
    }
    
    public void executarAcoesExpecificas(Funcionario f){
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
        else if(f instanceof Atendente){
            System.out.println(f.getNome() + " e atendente, nao tem acoes especificas.");
        }
        else{
            System.out.println("Funcionario não cadastrado");
        }
    }
    
    
}