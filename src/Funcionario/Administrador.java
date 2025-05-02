package Funcionario;

public class Administrador extends Funcionario {
    
    public Administrador(int id, String nome, String cpf, String cargo){
        super(id, nome, cpf, cargo);
    }
    
    public void gerarBalançoMensal(){
        System.out.println(getNome() + " gerando balanço mensal ");
    }
    
    public void gerarRelatorioDespesas(){
        System.out.println(getNome() + " gerando relatorio de despesas ");
    }
    
    public void gerarNotaFiscal(){
        System.out.println(getNome() + " gerando nota fiscal");
    }
    
    public void adicionarUsuario(){
        System.out.println(getNome() + " adicionando usuario");
    }
}
