/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Mecanico extends Funcionario {
    private String especialidade;
    
    public Mecanico(String nome, String cpf, String especialidade){
        super(nome, cpf, "Mecanico", TipoUsuario.Mecanico);
        this.especialidade = especialidade; 
    }
    
    public String getEspecialidade(){
        return especialidade;
    }
    
    public String toString(){
        return super.toString() + ", especialidade = " + especialidade + '\'';
    }
    
}
