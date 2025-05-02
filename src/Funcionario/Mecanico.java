package Funcionario;

public class Mecanico extends Funcionario {
    
    public Mecanico(int id, String nome, String cpf, String cargo){
        super(id, nome, cpf, cargo);
    }
    
    public void criarListaServiço(){
        System.out.println(getNome() + " criando lista de servico");
    }
    
    public void atualizarStatusVeiculo(){
        System.out.println(getNome() + " atualizando status do veiculo ");
    }
    
    public void gerarRelatorioInspecao(){
        System.out.println(getNome() + " gerando relatorio de inspecao");
    }
}
