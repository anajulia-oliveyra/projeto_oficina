package Funcionario;


public class Atendente extends Funcionario {
    public Atendente(int id, String nome, String cpf){
        super(id, nome, cpf, CargoUsuario.Atendente);
    }
    
    public void agendarServiço(){
        
    }
}
