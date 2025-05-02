package Funcionario;

/*import java.util.ArrayList;
import java.util.List;
*/
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
   /* private List<Funcionario> listaFuncionarios;
    
    public funcionarioController(){
        listaFuncionarios = new ArrayLis<>();
    }
    
    public void adicionarFuncionario(Funcionario funcionario){
        listaFuncionarios.add(funcionario);
        System.out.println("Funcionario adicionado com sucesso " + funcionario.getNome());
    }
    
    public Lis<Funcionario> listarFuncionarios(){
        return listaFuncionarios;
    }
    
    public Funcionario buscarPorId(int id){
        for(Funcionario f : listaFuncionarios){
            if (f.getId() == id){
                return f;
            }
        }
        return null;
    }
    
    public boolean removerFuncionario(int id){
        return listaFuncionarios.removeIf(f -> f.getId() == id);
    }
    
    public boolean atualizarFuncionario(Funcionario atualizado){
        for(int i = 0; i < listaFuncionarios.size(); i++){
            if(listaFuncionarios.get(i).getId() == atualizado.getId()){
                listaFuncionarios.set(i, atualizado);
                return true;
            }
        } 
        return false;
    }
}
*/