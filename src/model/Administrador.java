/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Administrador extends Funcionario {
    public Administrador(String nome, String cpf){
        super(nome, cpf, "Administrador", TipoUsuario.Administrador);
    }
    
    public void visualizarBalanço(){
        System.out.println("Acessando balanço ");
    }
    
}
