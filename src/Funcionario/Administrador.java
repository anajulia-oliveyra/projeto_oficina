package Funcionario;

public class Administrador extends Funcionario {
    
    public Administrador(int id, String nome, String cpf){
        super(id, nome, cpf, CargoUsuario.Administrador);
    }
    
    public void acessarRelatorios(){
        System.out.println("Relátorios financeiros ");
    }
    
    public void gerenciarFuncionarios(){
        System.out.println("Gerenciando funcionarios ");
    }
}
