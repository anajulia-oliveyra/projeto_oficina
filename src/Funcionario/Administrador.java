package Funcionario;

import Agenda.agenda;

public class Administrador extends Colaboradores {
    
    public Administrador(int id, String nome, String cargo, String cpf, agenda agenda){
        super(id, nome, cargo, cpf, agenda);
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
