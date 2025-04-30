/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Usuario {
    private String nome;
    private String login;
    private String senha;
    private TipoUsuario tipo;
    
    public Usuario(String nome, String login, String senha, TipoUsuario tipo){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }
    
    public String toString(){
        return "Usuario{ " +
                "Nome = '" + nome + '\'' +
                ", Login = '" + login + '\'' +
                ", Tipo = '" + tipo +
                '}';
    }
    
}
