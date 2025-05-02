package Funcionario;

public class funcionarioView {
    public static void main(String[]args){
        funcionarioController controle = new funcionarioController();
        
        Atendente atendente = new Atendente(1, "Ana Julia", "123.456.789.00");
        controle.adicionarFuncionario(atendente);
        
        Mecanico mecanico = new Mecanico(2, "Veloso", "987.654.321.00");
        controle.adicionarFuncionario(mecanico);
        
        for(Funcionario f : controle.listarFuncionarios()){
            System.out.println(f.getId() + " - " + f.getNome() + " - " + f.getTipoUsuario());
        }
        
        Funcionario buscado = controle.buscarPorId(2);
        System.out.println("Encontrado: " + buscado.getNome());
        
        controle.removerFuncionario(1);
    }
}
