package Funcionario;

public class Mecanico extends Funcionario {
    
    public Mecanico(int id, String nome, String cpf){
        super(id, nome, cpf, CargoUsuario.Mecanico);
    }
    
    public void realizarManutencao(){
        System.out.println("Realizando manutenção do veiculo");
    }
    
    public void verificarStatusVeiculo(){
        System.out.println("Verificando status do veiculo ");
    }
    
    
}
