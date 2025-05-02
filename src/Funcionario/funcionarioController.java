package Funcionario;

import java.util.ArrayList;
import java.util.List;

public class funcionarioController {
    private List<Funcionario> listaFuncionarios;
    
    public funcionarioController(){
        listaFuncionarios = new ArrayList<>();
    }
    
    public void adicionarFuncionario(Funcionario funcionario){
        listaFuncionarios.add(funcionario);
        System.out.println("Funcionario adicionado com sucesso " + funcionario.getNome());
    }
    
    public List<Funcionario> listarFuncionarios(){
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
